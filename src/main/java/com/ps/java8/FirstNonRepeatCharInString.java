package com.ps.java8;

public class FirstNonRepeatCharInString {
    public static void main(String[] args) {
        String test = "My Name is Khan And I am not a Terrorist";
        String test1 = "aaaa";

        test.chars().map(Character::toLowerCase).boxed()
                .filter(c -> test.indexOf(c) == test.lastIndexOf(c))
                .findFirst().ifPresent(i -> System.out.print((char) i.intValue()));


        //System.out.println("First Non Repeative Character is :: "+test1.chars().mapToObj(c->(char)c).map(n->Character.toLowerCase(n)).filter(i->test1.indexOf(i)==test1.lastIndexOf(i)).findFirst().orElse(null));
        System.out.println("First Not Repeative Char is " + test.chars().mapToObj(c -> (char) c).map(Character::toLowerCase).filter(i -> test.indexOf(i) == test.lastIndexOf(i)).findFirst().orElse(null));
    }
}
