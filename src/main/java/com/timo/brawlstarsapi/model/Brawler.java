package com.timo.brawlstarsapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Brawler {
    @JsonProperty("id")
    int id;
    @JsonProperty("name")
    String name;
    @JsonProperty("power")
    int power;
    @JsonProperty("trophies")
    int trophies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }
}
