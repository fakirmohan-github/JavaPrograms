package com.ps.y_2026.march;

public class FirstNonRepeativeCHarInString {
    public static void main(String[] args) {
        String str = "My Name is Sanjay";
        String lower = str.toLowerCase();
        str.chars()
                .mapToObj(ch->(char)ch)
                .map(Character::toLowerCase)
                .filter(c->lower.indexOf(c)==lower.lastIndexOf(c))
                .findFirst()
                .ifPresent(c->System.out.println("First Non Repeative Char is "+c));

    }
}
