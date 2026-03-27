package com.ps.y_2026.march;

import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintVowelsWithCountGT2 {
    public static void main(String[] args) {
        String input ="zzzaeioucciooa";
        String vowel ="aeiou";

        input.chars()
                .mapToObj(ch->(char)ch)
                .filter(c->vowel.indexOf(c)!=-1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>=2)
                .forEach(e->System.out.println(e.getKey()+" appears "+e.getValue()+" times"));

    }
}
