package com.timo.brawlstarsapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {
    @JsonProperty("id")
    int id;
    @JsonProperty("mode")
    String mode;
    @JsonProperty("map")
    String map;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }
}
