package com.ps.dsa.arrays;

import java.util.*;

public class TwoSumUsingCollection {
    public static void main(String[] args) {
        Integer[] arr= {1,3,13,4,6,7};
        int target=7;
        findTwoSumUsingCollection(arr,target);
        findTwoSumWithOptimalTC(arr,target);
    }

    // This Approach has time complexity as O(n2) as we have indexOf loop(O(n)) inside stream
    private static void findTwoSumUsingCollection(Integer[] arr, int target) {
        List<Integer> arrlist = Arrays.asList(arr);
        arrlist.stream()
                .filter(i->arrlist.indexOf(target-i)!=-1)
                .forEach(i->System.out.println("Pair Found :: "+i+","+(target-i)));
    }

    //This Approach has O(n) time complexity as only stream() is iterating
    private static void findTwoSumWithOptimalTC(Integer[] arr, int target) {
        List<Integer> arrList= Arrays.asList(arr);
        Set<Integer> seen = new HashSet<>();
        Set<String> result=new HashSet<>();
        arrList.stream().forEach(
                i->{
                    int partnerPair=target-i;
                    if(seen.contains(partnerPair)){
                        int smaller= Math.min(i,partnerPair);
                        int larger = Math.max(i,partnerPair);
                        result.add(smaller+","+larger);
                    }
                    seen.add(i);
                }
        );
        result.stream()
                .forEach(s->System.out.println("Pair Found : "+s));
    }
}
