package com.ps.ms;

public class FirstRepeativeCharacterInString {
    public static void main(String[] args) {
        String input = "FakirMohan";
        Character result=input.chars()
                .mapToObj(ch->(char)ch)
                .filter(c->input.indexOf(c)!=input.lastIndexOf(c))
                .findFirst()
                .get();
        System.out.println("First Repeative Character is :: "+result);
    }
}
