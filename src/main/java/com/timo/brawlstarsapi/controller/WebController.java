package com.timo.brawlstarsapi.controller;

import com.timo.brawlstarsapi.service.PlayerBattleLogService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    private final PlayerBattleLogService playerBattleLogService;
    @Value("${spring.application.name}")
    String appName;

    public WebController(PlayerBattleLogService playerBattleLogService) {
        this.playerBattleLogService = playerBattleLogService;
    }

    @GetMapping("/player/{playerTag}")
    public String homePage(@PathVariable String playerTag) throws Exception {
        // call brawl stars /players/{playerTag}/battlelog
        // parse list
        // return win rate
        String results = playerBattleLogService.getStatsSummary(String.format("#%s", playerTag));
        return results;
    }

//    @GetMapping("/club/{clubId}")
//    public String homePage(@PathVariable String id) {
//        // call brawl stars api for club members
//        // for each club member see how many games played
//        // return list from least to most active members
//        return "home";
//    }
}