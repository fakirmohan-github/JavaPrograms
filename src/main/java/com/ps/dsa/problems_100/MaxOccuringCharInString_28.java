package com.ps.dsa.problems_100;

import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccuringCharInString_28 {
    public static void main(String[] args) {
        String input = "Fakir Mohan Nayak";
        findMaxOccringChar(input);
    }

    private static void findMaxOccringChar(String input) {
        input.chars()
                .mapToObj(ch->(char)ch)
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .reduce((first,second)->first.getValue() > second.getValue() ? first:second)
                .stream()
                .forEach(System.out::println);
    }
}
