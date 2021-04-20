package com.company.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Bananas", "Melon", "Watermelon"));
        fruits.forEach(System.out::println);
        fruits.removeIf("Bananas"::equals);
        fruits.sort(Comparator.naturalOrder());
        System.out.println("After sort: ");
        fruits.forEach(System.out::println);
    }
}
