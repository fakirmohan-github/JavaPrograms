package com.ps.ms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccuranceInString {
    public static void main(String[] args) {
        String input="Fakir Mohan Nayak";
        Map<Character,Long> hm =  input.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
