package com.ps.java8;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> opt1=Optional.of("Fakir");
        Optional<String> opt2=Optional.of("Mohan");
        Optional<String> opt3=Optional.of("Mohan");

        Optional<String> opt4=Optional.empty();

        System.out.println(opt4.stream().findFirst());
        opt4=Optional.of("PS");
        System.out.println(opt4.stream().findFirst().get());

        System.out.println(opt1.equals(opt2));
        System.out.println(opt3.equals(opt2));
 
    }

}
