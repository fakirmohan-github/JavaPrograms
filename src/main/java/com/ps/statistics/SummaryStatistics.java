package com.ps.statistics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStatistics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use streams to collect summary statistics
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        // Print the summary statistics
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Count: " + stats.getCount());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
    }
}

