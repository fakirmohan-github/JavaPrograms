package com.ps.dsa.problems_100;

import java.util.HashSet;
import java.util.Set;

public class PairswithTargetSum_24 {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,1,3,5};
        int target=5;
        printPairsForTagetSum(arr,target);
        //optimal solution
        System.out.println("Below is the solution with lesser time complexity");
        printPairsWithTargetSum(arr,target);
    }

    private static void printPairsWithTargetSum(int[] arr, int target) {
        Set<Integer> seen=new HashSet<>();
        Set<String> resultPair=new HashSet<>();
        for(int i=0 ; i<arr.length ; i++){
            int requiredPair=target-arr[i];
            if(seen.contains(requiredPair)){
                int smaller=Math.min(requiredPair,arr[i]);
                int larger=Math.max(requiredPair,arr[i]);
                resultPair.add(smaller+","+larger);
            }else{
                seen.add(arr[i]);
            }
        }
        resultPair.stream().forEach(System.out::println);
    }

    private static void printPairsForTagetSum(int[] arr, int target) {
        Set<String> matchedPair=new HashSet<>();
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=i+1 ; j<arr.length ;j++){
                if(arr[i]+arr[j]==target){
                    int lower=Math.min(arr[i],arr[j]);
                    int higher=Math.max(arr[i],arr[j]);
                    matchedPair.add(lower+","+higher);
                }
            }
        }
        matchedPair.stream().forEach(System.out::println);
    }
}
