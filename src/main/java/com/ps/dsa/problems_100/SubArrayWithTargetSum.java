package com.ps.dsa.problems_100;

public class SubArrayWithTargetSum {
    public static void main(String[] args) {
        int target=7;
        int[] nums={2,3,1,2,4,3,0,7};
        int left=0;
        int minLen=nums.length;
        int currentSum =0;
        //Logic for Min Len of Subarray whose sum is greater than or equals to target
        for(int right=0 ; right<nums.length ; right++){
            currentSum=currentSum+nums[right];
            while(currentSum>=target){
                minLen=Math.min(minLen,right-left+1);
                currentSum=currentSum-nums[left];
                left++;
            }
        }
        System.out.println("Min Len of Sub Array with sum greater than or equals to target is "+minLen);
        //Logic for Min Len of Subarray whose sum is equals to target
        left=0;
        currentSum=0;
        minLen=nums.length;
        for(int right=0 ; right<nums.length ; right++){
            currentSum=currentSum+nums[right];
            while(currentSum>target){
                currentSum=currentSum-nums[left];
                left++;
            }
            if(currentSum==target)
                minLen=Math.min(minLen,right-left+1);

        }
        System.out.println("Min length of Sub Array with target sum :: "+minLen);
    }
}
