package com.timo.brawlstarsapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

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
