package com.company.function;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamApp {

    public static void main(String[] args) {
        Integer as = 23;
        int ba = 23;
        IntStream stream = IntStream.of(23, 234, 234);
        IntSummaryStatistics statistics = stream.summaryStatistics();
        int min = statistics.getMin();
        long sum = statistics.getSum();
        int max = statistics.getMax();
        long count = statistics.getCount();
        double average = statistics.getAverage();
        System.out.println("min " + min);
        System.out.println("sum " + sum);
        System.out.println("max " + max);
        System.out.println("count " + count);
        System.out.println("average " + average);

    }
}
