package com.company.function;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp {

    public static void main(String[] args) {
        List<String> fruits = List.of("Banana", "Melon", "watermelon");
        fruits.stream();
        Stream<String> fruitStream = fruits.stream();
        Stream<String> stream = Stream.of("Banana", "Melon", "watermelon");
        //stream.map(String::toUpperCase).forEach(System.out::println);

        String market = stream.map(String::toUpperCase).collect(Collectors.joining(","));
        Map<String, String> strings = stream
                .map(String::toUpperCase)
                .collect(Collectors.toMap(String::toUpperCase, String::toLowerCase));

        System.out.println("The market: " + market);
    }
}
