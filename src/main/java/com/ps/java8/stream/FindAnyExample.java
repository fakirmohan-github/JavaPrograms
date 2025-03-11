package com.ps.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("A","Bb","CC","D");
        Optional<String> obj1= list.stream()
                .filter(s->s.length()>1)
                .findAny();
        obj1.ifPresent(c->System.out.println(c));
    }
}
