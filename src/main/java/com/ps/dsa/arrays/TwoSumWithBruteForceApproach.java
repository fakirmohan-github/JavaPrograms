package com.ps.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class TwoSumWithBruteForceApproach {
    public static void main(String[] args) {
        int[] arr= {1,3,13,4,6,7};
        int target=7;
        List<int[]> arrList=findTwoSumPairs(arr,target);
        arrList.stream()
                .forEach(i->System.out.println("Pairs Found : "+i[0]+","+i[1]));
    }

    private static List<int[]> findTwoSumPairs(int[] arr, int target) {
        List<int[]> result= new ArrayList<>();
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]+arr[j]==target){
                    result.add(new int[]{arr[i],arr[j]});
                }
            }
        }
        return result;
    }
}
