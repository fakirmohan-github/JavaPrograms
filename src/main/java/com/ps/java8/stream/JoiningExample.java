package com.ps.java8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
        Stream<String> st= Stream.of("This","is","joinng");
        Stream<String> st1= Stream.of("This","is","joinng");
        Stream<String> st2= Stream.of("This","is","joinng");
        String str=null;
        String str1=null;
        String str2=null;

        str=st.collect(Collectors.joining());
        System.out.println(str);
        str1=st1.collect(Collectors.joining("_"));
        System.out.println(str1);
        str2=st2.collect(Collectors.joining(" "));
        System.out.println(str2);

    }
}
