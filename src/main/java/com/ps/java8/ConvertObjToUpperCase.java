package com.ps.java8;

import java.util.Arrays;
import java.util.List;

public class ConvertObjToUpperCase {
    public static void main(String[] args) {
        List<String> inputList= Arrays.asList("Java","is","awesome");
        //inputList.stream().map(String::toUpperCase).map(str->str+" ").forEach(System.out::print);
        //System.out.println("");
        inputList.stream().map(String::toUpperCase).forEach(s->System.out.print(s+" "));
    }
}
