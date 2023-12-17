package com.timo.brawlstarsapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BattleItem {
    @JsonProperty("battleTime")
    String battleTime;
    @JsonProperty("event")
    Event event;

    @JsonProperty("battle")
    Battle battle;

    public String getBattleTime() {
        return battleTime;
    }

    public void setBattleTime(String battleTime) {
        this.battleTime = battleTime;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Battle getBattle() {
        return battle;
    }

    public void setBattle(Battle battle) {
        this.battle = battle;
    }


}
