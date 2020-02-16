package com.rsjava.gifs.model;

import lombok.Data;

@Data
public class Gif {

    private String name;
    private String username;
    private Boolean favourite;
    private int categoryId;

    public Gif(String name, String username, Boolean favourite, int categoryId) {
        this.name = name;
        this.username = username;
        this.favourite = favourite;
        this.categoryId = categoryId;
    }
}
