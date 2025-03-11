package com.ps.dsa.problems_100;

public class ConvertStringToInt_5 {
    public static void main(String[] args) {
        String input="Fakir Mohan";
        input.chars()
                .mapToObj(c->(char)c)
                        .forEach(c->System.out.print(Integer.valueOf(c)));
    }
}
