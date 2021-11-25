package com.henrietha.basic.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {

    @JsonProperty("author")
    private String author;

    @JsonProperty("text")
    private String text;

    public Quote() {}

    public Quote(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
