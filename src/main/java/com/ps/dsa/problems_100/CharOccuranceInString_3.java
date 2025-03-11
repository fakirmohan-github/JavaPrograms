package com.ps.dsa.problems_100;

public class CharOccuranceInString_3 {
    public static void main(String[] args) {
        String input="Fakir Mohan";
        char target='a';
        long count=findNoOfOccurance(input,target);
        System.out.println(count);
    }

    private static long findNoOfOccurance(String input, char target) {
        long count=0;
        count=input.chars()
                .mapToObj(c->(char)c)
                .map(c->Character.toLowerCase(c))
                .filter(c->c==target)
                .count();
        return count;
    }
}
