package com.company.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MethodFactory {

    public static void main(String[] args) {
        List<String> fruits = List.of("banana", "apples");
        Set<String> animals = Set.of("Lion", "Monkey");
        Map<String, String> contacts = Map.of("email", "me@gmail.com", "twitter", "otaviojava");
    }
}
