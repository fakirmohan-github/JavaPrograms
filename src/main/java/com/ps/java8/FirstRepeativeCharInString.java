package com.ps.java8;

public class FirstRepeativeCharInString {
    public static void main(String[] args) {
        String test="The world is very beautiful !! Just feel it";
        System.out.println("First Repeative Character :: "
                +test.chars()
                .mapToObj(c->(char)c)
                .map(c->Character.toLowerCase(c))
                .filter(i->test.indexOf(i)!=test.lastIndexOf(i))
                .findFirst().orElse(null));
    }
}
