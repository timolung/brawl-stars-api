package com.timo.brawlstarsapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
    @JsonProperty("tag")
    String tag;
    @JsonProperty("name")
    String name;
    @JsonProperty("brawler")
    Brawler brawler;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brawler getBrawler() {
        return brawler;
    }

    public void setBrawler(Brawler brawler) {
        this.brawler = brawler;
    }
}
