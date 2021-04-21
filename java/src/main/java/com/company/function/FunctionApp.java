package com.company.function;

import java.util.function.Function;

public class FunctionApp {

    public static void main(String[] args) {
        Function<String, Integer> converter = s -> Integer.valueOf(s);
        Function<String, String> trim = String::trim;
        Function<String, String> upper = String::toUpperCase;
        Function<String, String> searchEngine = trim.andThen(upper);
        var text = "   giosepe deveria falar italiano   ";
        System.out.println("The brute value: " + text);
        System.out.println("The search engine: "
                + searchEngine.apply(text));


    }
}
