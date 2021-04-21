package com.company.soccer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Team {

    private final String name;
    private final List<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void add(Player player) {
        this.players
                .add(Objects.requireNonNull(player, "player is mandatory"));
    }

    public List<Player> getPlayers() {
        Comparator<Player> name = Comparator.comparing(Player::getName);
        Comparator<Player> city = Comparator.comparing(Player::getCity);
        Comparator<Player> comparator = name.thenComparing(city);
        return this.players
                .stream()
                .sorted(comparator)
                .collect(Collectors.toUnmodifiableList());
    }

    public Map<Position, List<Player>> getPlayerOrderByPosition() {
        return this.players
                .stream()
                .collect(Collectors.groupingBy(Player::getPosition));
    }

    public Player getArtilheiro() {
        Comparator<Player> score = Comparator.comparing(Player::getScore);
        Optional<Player> player = this.players.stream().sorted(score.reversed()).findFirst();
        return player.orElseThrow(() -> new RuntimeException("Regra de negocio"));
    }
    public int getGoals() {
        return this.players
                .stream()
                .mapToInt(Player::getScore)
                .sum();
    }



    public String getName() {
        return name;
    }
}
