package com.ps.y_2026.march;

import java.util.stream.Collectors;

public class RemoveDupsInString {
    public static void main(String[] args) {
        String input = "HappyNewYear";
        //Expected Output = hapynewr

        String result=input.chars()
                .mapToObj(ch->(char)ch)
                .map(Character::toLowerCase)
                .collect(Collectors.toSet())
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("Result is "+result);

        //Using distinct

        System.out.println("Result is "+input.chars()
                .distinct()
                .mapToObj(ch->(char)ch)
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }
}
