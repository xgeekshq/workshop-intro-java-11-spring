package com.company.function;

import java.util.function.Predicate;

public class PredicateApp {

    public static void main(String[] args) {
        Predicate<String> startsWithA = s -> s.startsWith("A");
        Predicate<String> startsWithB = s -> s.startsWith("B");
        Predicate<String> predicate = startsWithA.and(startsWithB);
        System.out.println("My status is " + predicate.test("Animal"));
    }
}
