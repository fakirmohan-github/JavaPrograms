package com.ps.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VowelsWithIndexInString {
    public static void main(String[] args) {
        String input = "Mohan is java developer";
        String vowels = "aeiou";  // Include both lowercase and uppercase vowels

        /*rangeIntStream.range(0,input.length())
                .*/

        Map<Character, List<List<Integer>>> result =
                input.chars()  // Create an IntStream from the string
                        .mapToObj(ch -> (char) ch)  // Convert to Character stream
                        .filter(c -> vowels.indexOf(c) != -1)  // Filter vowels
                        .collect(Collectors.groupingBy(  // Group by the vowel character
                                Function.identity(),
                                LinkedHashMap::new,  // Preserve insertion order
                                Collectors.mapping(  // Collect indices for each vowel
                                        ch -> {
                                            List<Integer> indices = new ArrayList<>();
                                            int index = input.indexOf(ch);
                                            while (index >= 0) {
                                                indices.add(index);
                                                index = input.indexOf(ch, index + 1);  // Search next occurrence
                                            }
                                            return indices;
                                        },
                                        Collectors.toList()
                                )
                        ));

        // Print the result
        System.out.println(result);

        /*input.chars()
                .mapToObj(ch->(char)ch)
                .map(ch->Character.toLowerCase(ch))
                .filter(ch->vowels.indexOf(ch)!=-1)
                .collct(Collectors.groupingBy())*/


        /*IntStream.range(0, input.length())
                .filter(i -> vowels.indexOf(input.charAt(i)) != -1)
                .boxed()
                .collect(Collectors.groupingBy(i -> input.charAt(i), LinkedHashMap::new, Collectors.toList()))
                .forEach((vowel, indices) -> System.out.println("Vowel: " + vowel + " at indices: " + indices.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", "))));*/
    }
}
