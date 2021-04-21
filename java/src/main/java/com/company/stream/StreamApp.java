package com.company.stream;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApp {

    public static void main(String[] args) {
        List<String> fruits = List.of("Banana", "Melon", "Watermelon");
        fruits.stream().sorted().collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        fruits.stream().sorted().collect(Collectors.toUnmodifiableList());
        Map<Boolean, List<String>> startWithB = fruits.stream().collect(Collectors.partitioningBy(f -> f.startsWith("B")));
        System.out.println("Start with B " + startWithB);
        Map<String, List<String>> initials = fruits.stream().collect(Collectors.groupingBy(s -> s.substring(0)));
        System.out.println("Initials: " + initials);
    }
}
