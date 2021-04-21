package com.company.function;

import java.util.function.Function;

public class FunctionApp {

    public static void main(String[] args) {
        Function<String, Integer> toNumber = Integer::parseInt;
        System.out.println("To number: " + toNumber.apply("234"));
        Function<String, String> upperCase = String::toUpperCase;
        Function<String, String> trim = String::trim;
        Function<String, String> searchEngine = upperCase.andThen(trim);
        System.out.println("Search result: " + searchEngine.apply("   test one two   "));

    }
}