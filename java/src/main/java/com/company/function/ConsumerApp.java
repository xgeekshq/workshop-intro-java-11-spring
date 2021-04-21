package com.company.function;

import java.util.function.Consumer;

public class ConsumerApp {

    public static void main(String[] args) {
        Consumer<String> log = s -> System.out.println("The log " +s);
        Consumer<String> logB = s -> System.out.println("The logB " +s);
        log.andThen(logB).accept("The value A");
    }
}