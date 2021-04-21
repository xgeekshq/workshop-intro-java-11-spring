package com.company.stream;

import java.util.DoubleSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class StreamDoubleApp {

    public static void main(String[] args) {
        DoubleStream stream = DoubleStream.of(1, 2, 3, 4);
        DoubleSummaryStatistics statistics = stream.summaryStatistics();
        double min = statistics.getMin();
        double max = statistics.getMax();
        double average = statistics.getAverage();
        long count = statistics.getCount();
        double sum = statistics.getSum();
    }
}
