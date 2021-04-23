package io.xgeeks.examples.spring;


import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class Fruits {

    private Map<String, Fruit> database;

    public Fruits() {
        this.database = new HashMap<>();
    }

    public void save(Fruit fruit) {
        this.database.put(fruit.getName(), fruit);
    }
    public void delete(String name) {
        this.database.remove(name);
    }
    public Optional<Fruit> findById(String name) {
        return Optional.ofNullable(this.database.get(name));
    }

    public List<Fruit> findAll() {
        return this.database
                .values()
                .stream()
                .collect(Collectors.toUnmodifiableList());
    }
}
