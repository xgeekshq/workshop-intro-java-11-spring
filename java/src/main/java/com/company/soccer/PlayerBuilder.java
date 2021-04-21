package com.company.soccer;

import java.util.Objects;

public class PlayerBuilder {
    private String name;
    private String city;
    private String country;
    private String email;
    private Position position;
    private int score;

    public PlayerBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder city(String city) {
        this.city = city;
        return this;
    }

    public PlayerBuilder country(String country) {
        this.country = country;
        return this;
    }

    public PlayerBuilder email(String email) {
        //if email is valid
        this.email = Objects.requireNonNull(email, "email is required");
        return this;
    }

    public PlayerBuilder position(Position position) {
        this.position = position;
        return this;
    }

    public PlayerBuilder score(int score) {
        if(score < 0) {
            throw new IllegalArgumentException("");
        }
        this.score = score;
        return this;
    }

    public Player build() {
        //do validations
        return new Player(name, city, country, email, position, score);
    }
}