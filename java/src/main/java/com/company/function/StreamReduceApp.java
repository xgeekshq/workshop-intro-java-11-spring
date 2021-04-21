package com.company.function;

import java.util.List;
import java.util.Optional;

public class StreamReduceApp {

    public static void main(String[] args) {
        List<String> inputs = List.of("12", "24", "42");
        Optional<Integer> reduce = inputs.stream()
                .map(s -> Integer.parseInt(s))
                .reduce((a, b) -> a + b);
        System.out.println("The reduce result is: " + reduce.orElse(0));

    }
}
