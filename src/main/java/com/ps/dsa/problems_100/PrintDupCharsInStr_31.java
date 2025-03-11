package com.ps.dsa.problems_100;

public class PrintDupCharsInStr_31 {
    public static void main(String[] args) {
        String input="Fakir Mohan Nayak";
        printDupChars(input);
    }

    private static void printDupChars(String input) {
        input.chars()
                .mapToObj(ch->(char)ch)
                .map(Character::toLowerCase)
                .filter(ch->input.indexOf(ch)!=input.lastIndexOf(ch))
                .distinct()
                .forEach(ch->System.out.print(" "+ch));
    }
}
