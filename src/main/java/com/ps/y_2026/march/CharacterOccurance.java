package com.ps.y_2026.march;

public class CharacterOccurance {
    public static void main(String[] args) {
        String input = "fakir mohan nayak";
        char c = 'k';
        System.out.println(findOccurance(input, c));
    }
    public static long findOccurance(String str, Character ch){
        return str.chars()
                .filter(c->c==ch)
                .count();
    }
}

