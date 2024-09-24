package com.ps.java8;

public class CharacterOccurance {
    public static void main(String[] args) {
        String input="fakir mohan nayak";
        char c='k';
        System.out.println(findOccurance(input,c));
    }
    private static long findOccurance(String input, char ch) {
       return input.chars().filter(c->c==ch).count();
    }
}
