package io.xgeeks.examples.spring;

import org.springframework.stereotype.Service;

@Service
public class FruitService {

    private final Fruits fruits;

    public FruitService(Fruits fruits) {
        this.fruits = fruits;
    }

    public Fruit insert(Fruit fruit) {
        //validation
        this.fruits.save(fruit);
        return fruit;
    }
}
