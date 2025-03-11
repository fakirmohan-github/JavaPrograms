package com.ps.java8;

//Print the vowels from the input string whose count is greater than 2

// O/p Format --> a appears 2 times
//o appears 3 times --- like this


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintVowelsGreaterThan2 {
    public static void main(String[] args) {
        String input ="zzzaeioucciooa";
        String vowel ="aeiou";

        input.chars().
                mapToObj(ch->(char)ch)
                .filter(ch->vowel.indexOf(ch) != -1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m->m.getValue() >= 2)
                .forEach(m->System.out.println(m.getKey()+" appears "+m.getValue()+" times." ));

    }
}
