package com.company.function;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class CollectionApp {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("watermelon");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits.forEach(System.out::println);
        Predicate<String> banana = s -> s.equals("Banana");
        fruits.removeIf(banana.negate());
        System.out.println("The result " + fruits);

        System.out.println("fruits " + fruits);
        Set<String> fruitsV = Set.of("Banana", "Apple", "watermelon");
        Map<String, String> map = Map.of("key", "value");
    }
}
