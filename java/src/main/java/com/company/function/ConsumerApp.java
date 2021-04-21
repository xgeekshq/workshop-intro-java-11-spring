package com.company.function;

import java.util.function.Consumer;

public class ConsumerApp {

    public static void main(String[] args) {
        Consumer<String> log = s -> System.out.println("the log a " + s);
        Consumer<String> logB = s -> System.out.println("the log b " + s);
        log.accept("Test");
        log.andThen(logB).accept("João caroço");

    }
}
