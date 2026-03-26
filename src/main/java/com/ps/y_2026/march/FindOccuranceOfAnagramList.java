package com.ps.y_2026.march;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccuranceOfAnagramList {
    public static void main(String[] args) {
        //List<String> input = Arrays.asList("Hello","world","hlole","owrdl","mohan");
        String[] input = {"Hello", "world", "hlole", "owrdl", "mohan"};
        Arrays.stream(input)
                .map(s->
                    s.toLowerCase()
                            .chars()
                            .mapToObj(ch->String.valueOf((char)ch))
                            .sorted()
                            .collect(Collectors.joining())
                ).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)->System.out.println(k+" : "+v));
    }
}
