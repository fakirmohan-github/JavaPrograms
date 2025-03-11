package com.ps.dsa.arrays;

public class LenOfSmallestSubArrayWithTargetSum {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,2,1,6};
        int target = 6;
        int result=findMinLenFOrTargetOrGreaterSum(arr,target);
        System.out.println("Result is "+result);
    }

    private static int findMinLenFOrTargetOrGreaterSum(int[] arr, int target) {
        int result=arr.length;
        int left=0;
        int currentSum=0;
        int currentLen=0;
        for(int right=0; right<arr.length ; right++){
            currentSum+=arr[right];
            currentLen++;
            while(currentSum>=target){
                result=Math.min(result,currentLen);
                currentSum-=arr[left];
                left++;
                currentLen--;
            }
        }
        return result;
    }
}
