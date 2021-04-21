package com.company.soccer;

public class Player {

    private String name;

    private String city;

    private String country;

    private String email;

    private Position position;

    private int score;

    Player(String name, String city, String country,
                  String email, Position position, int score) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.email = email;
        this.position = position;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public Position getPosition() {
        return position;
    }

    public int getScore() {
        return score;
    }

    public void update(Player player) {
        this.name = player.name;
        this.city = player.city;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", position=" + position +
                ", score=" + score +
                '}';
    }

    public static PlayerBuilder builder() {
        return new PlayerBuilder();
    }

    public static PlayerFluent fluent() {
        return new PersonFluentBuilder();
    }

}
