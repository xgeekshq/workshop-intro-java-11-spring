package com.company.soccer;

import java.util.List;
import java.util.Map;

public class TeamApp {

    public static void main(String[] args) {
        Team leiria = new Team("União de Leiria");
        leiria.getName();
        Player cristianoRonaldo = Player
                .builder()
                .name("Cristiano")
                .city("Lisbon")
                .country("Portugal")
                .email("cris@cris.com")
                .position(Position.NON_GOAL_KEEPER)
                .score(10).build();
        Player cristianoRonaldoA = Player
                .builder()
                .name("Cristiano")
                .city("Leiria")
                .country("Portugal")
                .email("cris@cris.com")
                .position(Position.GOAL_KEEPER)
                .score(50).build();
        leiria.add(cristianoRonaldo);
        leiria.add(cristianoRonaldoA);

        System.out.println("players: " + leiria.getPlayers());
        Map<Position, List<Player>> map = leiria.getPlayerOrderByPosition();
        System.out.println("GOAL_KEEPER by: " + map.get(Position.GOAL_KEEPER));
        System.out.println("NON_GOAL_KEEPER by: " + map.get(Position.NON_GOAL_KEEPER));

        System.out.println("score: " + leiria.getGoals());

        System.out.println("o artilheiro: " + leiria.getArtilheiro());
    }
}
