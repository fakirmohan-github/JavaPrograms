package com.ps.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccuranceOfAnagramList {
    public static void main(String[] args) {
        //List<String> input = Arrays.asList("Hello","world","hlole","owrdl","mohan");
        String[] input={"Hello","world","hlole","owrdl","mohan"};
        Arrays.stream(input)
                .map(s->s.toLowerCase())
                .map(s->{
                    char[] arrs=s.toCharArray();
                    Arrays.sort(arrs);
                    return new String(arrs);
                })
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)->System.out.println(k+" occurs "+v+" times"));
    }
}
