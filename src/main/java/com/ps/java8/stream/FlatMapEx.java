package com.ps.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapEx {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("fakir", "mohan", "nayak");

        strList.stream()
                .flatMap(str -> str.chars()   // Convert each string to a stream of ints (Unicode values of characters)
                        .mapToObj(c -> (char) c)) // Convert each int to a Character object
                .forEach(System.out::println);  // Print each character
    }
}

