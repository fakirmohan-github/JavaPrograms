package com.ps.dsa.problems_100;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharInString_27 {
    public static void main(String[] args) {
        String input="Fakir Mohan Nayak";
        removeDuplicateChars(input);
    }

    private static void removeDuplicateChars(String input) {
        Set<Character> result =new LinkedHashSet<>();
        input.chars()
                .mapToObj(ch->(char)ch)
                .map(ch->Character.toLowerCase(ch))
                .forEach(ch->result.add(ch));
        System.out.println(result.stream()
                .map(String::valueOf)
                .collect(Collectors.joining()));

    }
}
