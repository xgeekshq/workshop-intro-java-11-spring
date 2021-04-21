package com.company.stream;

import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamLongApp {

    public static void main(String[] args) {
        LongStream stream = LongStream.of(1, 2, 3, 4);
        LongSummaryStatistics statistics = stream.summaryStatistics();
        long min = statistics.getMin();
        long max = statistics.getMax();
        double average = statistics.getAverage();
        long count = statistics.getCount();
        long sum = statistics.getSum();
    }
}
