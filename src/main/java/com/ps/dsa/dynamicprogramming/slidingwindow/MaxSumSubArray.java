package com.ps.dsa.dynamicprogramming.slidingwindow;

/*
Given an array of integers, Find maximum sum subarray of the required size.

We choose Sliding Window over BruteForce Approach as in BruteForce approach Space
Complexity is O(n) as we had to store all the subArray sum to HashTable.

Sliding Window Technique is a method for finding subarrays in an array that satisfy given conditions.
We do this via maintaining a subset of items as our window and resize and move that window within the larger list until we find a solution.

Sliding Window Approach
------------------------
Time Complexity is O(n) as we have to iterate the whole array.
Space Complexity is O(1) as we only have to store the current subarray start and end index and maxSum of previous subarray
 */

public class MaxSumSubArray {
    public static void main(String[] args) {
        int subArrSize=2;
        int maxSum=0;
        int[] inputArr={1,3,2,4,4,2,4,5,1};
        for(int i=0; i<inputArr.length ;i++){

        }
    }

}
