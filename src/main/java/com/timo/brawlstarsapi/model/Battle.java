package com.timo.brawlstarsapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Battle {
    @JsonProperty("mode")
    String mode;
    @JsonProperty("type")
    String type;
    @JsonProperty("result")
    String result;
    @JsonProperty("duration")
    int duration;
    @JsonProperty("trophyChange")
    int trophyChange;
    @JsonProperty("starPlayer")
    Player starPlayer;
    @JsonProperty("teams")
    Player[][] teams;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTrophyChange() {
        return trophyChange;
    }

    public void setTrophyChange(int trophyChange) {
        this.trophyChange = trophyChange;
    }

    public Player getStarPlayer() {
        return starPlayer;
    }

    public void setStarPlayer(Player starPlayer) {
        this.starPlayer = starPlayer;
    }

    public Player[][] getTeams() {
        return teams;
    }

    public void setTeams(Player[][] teams) {
        this.teams = teams;
    }
}
