package com.ps.java10;

import java.util.*;

public class ImmutableMapUsingCopyOf {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();

        Map<String,String> arrMap = new HashMap<>();
        arrMap.put("Fakir","Fakir");
        arrMap.put("Mohan","Mohan");
        arrMap.put("Nayak","Nayak");
        System.out.println("arrMap - Before Calling CopyOf :: ");
        arrMap.forEach((k,v)->System.out.println(k+" : "+v));
        arrMap=Map.copyOf(arrMap);
        doNotChangeMap(arrMap);
        arrMap.forEach((k,v)->System.out.print(k+" : "+v));

    }

    private static void doNotChangeMap(Map<String, String> arrMap) {
        arrMap.put("CantAdd","CantAdd");
    }
}

