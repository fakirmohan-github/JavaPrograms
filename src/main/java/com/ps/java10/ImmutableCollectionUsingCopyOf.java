package com.ps.java10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImmutableCollectionUsingCopyOf {
    public static void main(String[] args) {
        List<String> arrList=new ArrayList<>();
        arrList.add("Fakir");
        arrList.add("Mohan");
        arrList.add("Nayak");
        System.out.println("Before Calling CopyOf :: ");
        arrList.stream().forEach(System.out::println);
        arrList=List.copyOf(arrList);
        doNotChangeList(arrList);
        System.out.println("After Calling CopyOf :: ");
        arrList.stream().forEach(System.out::println);

        Set<String> arrSet=new HashSet<>();
        arrSet.add("Fakir");
        arrSet.add("Mohan");
        arrSet.add("Nayak");
        System.out.println("arrSet - Before Calling CopyOf :: ");
        arrSet.stream().forEach(System.out::println);
        Set.copyOf(arrSet);
        doNotChangeSet(arrSet);
        arrSet.forEach(System.out::println);

    }

    private static void doNotChangeSet(Set<String> arrSet) {
        arrSet.add("CannotAdd");
    }

    private static void doNotChangeList(List<String> arrList) {
        arrList.add("ShouldNotAddElements");
    }
}
