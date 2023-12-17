package com.timo.brawlstarsapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BattleLogStats implements Serializable {
    @JsonProperty("starPlayerRatio")
    Double starPlayerRatio;

    @JsonProperty("winRatio")
    Double winRatio;

    public BattleLogStats() {

    }

    public BattleLogStats(Double starPlayerRatio, Double winRatio) {
        this.starPlayerRatio = starPlayerRatio;
        this.winRatio = winRatio;
    }

    public Double getStarPlayerRatio() {
        return starPlayerRatio;
    }

    public void setStarPlayerRatio(Double starPlayerRatio) {
        this.starPlayerRatio = starPlayerRatio;
    }

    public Double getWinRatio() {
        return winRatio;
    }

    public void setWinRatio(Double winRatio) {
        this.winRatio = winRatio;
    }
}
