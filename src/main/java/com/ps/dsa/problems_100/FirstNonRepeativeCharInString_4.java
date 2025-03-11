package com.ps.dsa.problems_100;

public class FirstNonRepeativeCharInString_4 {
    public static void main(String[] args) {
        String input="Fakir Mohan";
        Character result=input.chars()
                .mapToObj(c->(char)c)
                .map(c->Character.toLowerCase(c))
                .filter(c-> input.indexOf(c)==input.lastIndexOf(c))
                .findFirst()
                .get();
        System.out.println("First Non Repeative Character "+result);
    }
}
