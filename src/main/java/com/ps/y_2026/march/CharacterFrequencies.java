package com.ps.y_2026.march;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencies {
    public static void main(String[] args) {
        String str = "Fakir Mohan Nayak";
        str.chars()
                .mapToObj(ch->(char)ch)
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)->System.out.println(k+":"+v));
    }
}
