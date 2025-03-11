package com.ps.java8.optional;

import java.util.Optional;

class Chapter{
    //String summary;
    Optional<String> summary;
}

public class OptionalMain {
    public static void main(String[] args) {
        Chapter c= new Chapter();
        //System.out.println(c.summary.length());
        c.summary.ifPresent(a->System.out.println(" Data : "+a.length()));

        Optional<String> summary3 =Optional.of("Good");
        summary3.ifPresent(s->System.out.println());



    }
}
