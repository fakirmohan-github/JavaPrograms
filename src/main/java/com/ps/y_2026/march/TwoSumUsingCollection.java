package com.ps.y_2026.march;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSumUsingCollection {
    public static void main(String[] args) {
        Integer[] arr= {1,3,13,4,6,7};
        int target=7;
        findPairsWithTargetSum(arr,target);
    }

    private static void findPairsWithTargetSum(Integer[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> result = new HashSet<>();
        Arrays.asList(arr).forEach(num->{
            if(seen.contains(target-num)){
                result.add(Math.min(num,target-num)+","+Math.max(num,target-num));
            }
            seen.add(num);
        });
        result.forEach(s->System.out.println("Pair Found : "+s));
    }
}
