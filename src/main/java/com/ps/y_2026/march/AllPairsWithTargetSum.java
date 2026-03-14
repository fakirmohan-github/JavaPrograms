package com.ps.y_2026.march;

import java.util.HashSet;

public class AllPairsWithTargetSum {

    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 2, 15, 8, 1,1};
        int target = 9;
        findAllPairsWithTargetSum(arr,target);
    }

    private static void findAllPairsWithTargetSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> pairs = new HashSet<>();
        for (int num : arr){
            int complement = target-num;
            if(seen.contains(complement)){
                pairs.add(Math.min(num,complement)+","+Math.max(num,complement));
            }
            seen.add(num);
        }
        if(pairs.isEmpty()){
            System.out.println("No such pair found");
        }else{
            pairs.forEach(s->System.out.println(s));
        }
    }
}
