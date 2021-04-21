package com.company.stream;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class StreamReduceApp {

    public static void main(String[] args) {
        List<BigDecimal> values = List.of(BigDecimal.ONE, BigDecimal.TEN);
        Optional<BigDecimal> total = values.stream().reduce(BigDecimal::add);
        System.out.println(total);
    }
}
