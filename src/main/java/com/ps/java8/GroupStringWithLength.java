package com.ps.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupStringWithLength {
    public static void main(String[] args) {

        List<String> input=Arrays.asList("apple", "banana", "orange", "kiwi", "grape");
        // {4=[kiwi], 5=[apple, grape], 6=[banana, orange]}
        //{4=1, 5=2, 6=2}
        Map<Integer,Integer> result = new HashMap<>();

        input.stream()
                .forEach(str->{
                    if(result.get(str.length())!=null)
                            result.put(str.length(),result.get(str.length())+1);
                    else
                        result.put(str.length(),1);
                });

        result.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+"="+entry.getValue()));

    }
}
