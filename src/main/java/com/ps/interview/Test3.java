package com.ps.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        /*
        String str = "bb aa cc aa aa cc aa cc bb cc bb cc";
Output:- bb 3
  aa 4
  cc 5
         */
        String str = "bb aa cc aa aa cc aa cc bb cc bb cc";
        Map<String,Long> strMap= Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        /*strMap.entrySet().stream()
                .reduce((first,second)->first.getValue()>second.getValue()?first=second)
                .stream().collect(Collectors.toMap());*/

    }
}
