package com.ps.ms;

public class FirstNonRepeativeCharacter {
    public static void main(String[] args) {
        String input ="FakirMohan";
        Character result =input.chars()
                .mapToObj(ch->(char)ch)
                .map(ch->Character.toLowerCase(ch))
                .filter(c->input.indexOf(c)==input.lastIndexOf(c))
                .findFirst()
                .get();
        System.out.println("First Non Repeative Character is :: "+result);
    }
}
