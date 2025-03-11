package com.ps.java8.stream;

import java.util.stream.Stream;

public class BoxedExample {
    public static void main(String[] args) {
        Stream.of("java","python","react").flatMap(s->s.chars().boxed()).forEach(System.out::print);
    }
}
