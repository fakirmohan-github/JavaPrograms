package com.ps.java10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImmutableSetUsingCopyOf {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();

        Set<String> arrSet = new HashSet<>();
        arrSet.add("Fakir");
        arrSet.add("Mohan");
        arrSet.add("Nayak");
        System.out.println("arrSet - Before Calling CopyOf :: ");
        arrSet.stream().forEach(System.out::println);
        arrSet=Set.copyOf(arrSet);
        doNotChangeSet(arrSet);
        arrSet.forEach(System.out::println);

    }

    private static void doNotChangeSet(Set<String> arrSet) {
        arrSet.add("CannotAdd");
    }

}

