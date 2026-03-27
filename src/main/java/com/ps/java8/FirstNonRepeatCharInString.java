package com.ps.java8;

public class FirstNonRepeatCharInString {
    public static void main(String[] args) {
        String test = "My Name is Khan And I am not a Terrorist";
        String test1 = "aaaa";

        test.chars().map(Character::toLowerCase).boxed()
                .filter(c -> test.toLowerCase().indexOf(c) == test.toLowerCase().lastIndexOf(c))
                .findFirst().ifPresent(i -> System.out.print((char) i.intValue()));
        }
}
