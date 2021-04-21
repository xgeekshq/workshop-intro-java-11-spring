package com.company.soccer;

public class SoccerApp {

    public static void main(String[] args) {
        Player cristianoRonaldo = Player
                .builder()
                .name("Cristiano")
                        .city("Lisbon")
                        .country("Portugal")
                        .email("cris@cris.com")
                        .position(Position.NON_GOAL_KEEPER)
                        .score(10).build();

        Player neymar = Player.fluent()
                .name("Neymar")
                .city("Santos")
                .build();

    }
}
