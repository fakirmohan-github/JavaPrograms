package com.ps.dsa.problems_100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInArrayInPlace_8 {
    public static void main(String[] args) {
        int[] arr={4,2,4,1,7,1};
        removeDuplicates(arr);//This will have time complexity O(n2) as list.contains also have O(n) time complexity.
        //Optimal Solution -- Using Set as add method has O(1) time complexity
        System.out.println("With optimal Solution");
        removeDuplicatesWithOptimalSol(arr);
    }

    private static void removeDuplicatesWithOptimalSol(int[] arr) {
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0 ; i<arr.length ; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }

    private static void removeDuplicates(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0 ; i<arr.length-1 ; i++){
            if(!list.contains(arr[i]))
                list.add(arr[i]);
        }
        System.out.println(list.toString());
    }
}
