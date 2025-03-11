package com.ps.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String input = "HappyNewYear";
        //Expected Output = hapynewr

        //Using Stream API

        String result = input.chars()
                .distinct()
                .mapToObj(ch->(char)ch)
                .map(ch->String.valueOf(ch))
                .collect(Collectors.joining());

        System.out.println("Result is "+result);

        //Without Using Stream
        Set<Character> characterHasSet=new HashSet<>();



    }
}
