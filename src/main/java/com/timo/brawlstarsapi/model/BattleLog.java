package com.timo.brawlstarsapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BattleLog {
    @JsonProperty("items")
    BattleItem[] battleLog;

    public BattleItem[] getBattleLog() {
        return battleLog;
    }

    public void setBattleLog(BattleItem[] battleLog) {
        this.battleLog = battleLog;
    }


}
