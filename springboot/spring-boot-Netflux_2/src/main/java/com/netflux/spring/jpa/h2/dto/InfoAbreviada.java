package com.netflux.spring.jpa.h2.dto;

public class InfoAbreviada {
    private String id;
    private String type;
    private String url;
    private String title;
    private String imgURL;

    // Constructor
    public InfoAbreviada(String id, String url, String title, String imgURL) {
        this.id = id;
        this.url = url;
        this.title = title;
        this.imgURL = imgURL;
    }

    // Getters y Setters
}
