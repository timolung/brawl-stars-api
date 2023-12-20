package com.timo.brawlstarsapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.timo.brawlstarsapi.model.Battle;
import com.timo.brawlstarsapi.model.BattleItem;
import com.timo.brawlstarsapi.model.BattleLog;
import com.timo.brawlstarsapi.model.BattleLogStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.io.*;

@Service
public class PlayerBattleLogService {
    @Autowired
    private RestClient restClient;
    @Value("${oauth.bearer.token}")
    private String bearerToken;
    @Value("${brawl.stars.api.endpoint.battle-log}")
    String battleLogEndpoint;

    // API Call, Creates BattleLog Object
    public BattleLog getBattleLog(String playerTag) {
        final String bearerTokenHeader = String.format("Bearer: %s", this.bearerToken);
        return this.restClient.get()
                .uri(battleLogEndpoint, playerTag)
                .header("Authorization", bearerTokenHeader)
                .retrieve()
                .body(BattleLog.class);
    }

    public String getPlayerInfo(String playerTag) {
        return "oopsie";
    }

    // Main Player BattleLog Call
    public String getStatsSummary(String playerTag) throws IOException {
        BattleLog battleLog = this.getBattleLog(playerTag);
        // get player info
        return getBattleLogStats(battleLog, playerTag);
    }

    public String getBattleLogStats(BattleLog battleLog, String playerTag) throws IOException {
//        BattleLogStats resp = new BattleLogStats();
        // get power league stats
        // get brawler stats
        int wins = 0;
        int starPlayerCount = 0;
        int battleLogLength = battleLog.getBattleLog().length;
        int starPlayerGamesLength = battleLogLength;
        for(BattleItem battleItem : battleLog.getBattleLog()) {
            Battle battle = battleItem.getBattle();
            if(battle.getResult().equals("victory")) {
                wins++;
            }
            if(battle.getStarPlayer() == null) {
                starPlayerGamesLength--;
            }else if(battle.getStarPlayer().getTag().equals(playerTag)) {
                starPlayerCount++;
            }
        }
        double winRatio = (double) wins / battleLogLength;
        double starPlayerRatio = (double) starPlayerCount / starPlayerGamesLength;

        BattleLogStats res = new BattleLogStats(starPlayerRatio, winRatio);
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

        return ow.writeValueAsString(res);
    }

}
