package com.company.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamIntApp {

    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4);
        IntSummaryStatistics statistics = stream.summaryStatistics();
        int min = statistics.getMin();
        int max = statistics.getMax();
        double average = statistics.getAverage();
        long count = statistics.getCount();
        long sum = statistics.getSum();
    }
}
