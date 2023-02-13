package com.mycomp.security.oauth2.model;

public class Comment {
    private Long id;
    private String description;

    public Comment(final Long id, final String description) {
        this.id = id;
        this.description = description;
    }
}
