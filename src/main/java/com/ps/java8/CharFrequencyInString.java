package com.ps.java8;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequencyInString {
    public static void main(String[] args) {
        String inputString = "You are my Best Friend";
        inputString.chars()
                .map(Character::toLowerCase)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println((char)k.intValue() + ":" + v));

    }
}
