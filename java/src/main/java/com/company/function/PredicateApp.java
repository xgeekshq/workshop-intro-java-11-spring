package com.company.function;

import java.util.function.Predicate;

public class PredicateApp {

    public static void main(String[] args) {
        Predicate<String> startWithA = s -> s.startsWith("A");
        Predicate<String> startWithB = s -> s.startsWith("B");
        System.out.println(startWithA.and(startWithB).test("Animal"));
    }
}