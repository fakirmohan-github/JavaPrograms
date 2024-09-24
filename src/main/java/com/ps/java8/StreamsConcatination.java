package com.ps.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsConcatination {
    public static void main(String[] args) {
        List<String> strList1= Arrays.asList("Java","is","my");
        List<String> strList2= Arrays.asList("favorite","language");

        Stream.concat(strList1.stream(),strList2.stream()).forEach(s->System.out.print(s+" "));
    }

}
