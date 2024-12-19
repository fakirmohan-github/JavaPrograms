package com.ps.dsa.arrays;

/*

Find the Largest Sum Subarray (Kadane’s Algorithm): Given an array of integers,
find the contiguous subarray with the largest sum.

---

Approach:
Two Pointers:
Use one pointer i to iterate over the array, and another pointer lastNonZeroFoundAt to keep track of the position where the next non-zero element should be placed.
If the current element is non-zero, swap it with the element at lastNonZeroFoundAt and then increment lastNonZeroFoundAt.
Continue iterating through the array.
Result: By the end of the iteration, all the non-zero elements are moved to the beginning of the array, and the zeroes are pushed towards the end.


*/

public class LargestSumSubArray {
    public static void main(String[] args) {
        int[] intArr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum=intArr[0];
        int maxSum=intArr[0];
        for (int i=1;i<intArr.length;i++){
            currentSum=Math.max(intArr[i],currentSum+intArr[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        System.out.println("LongestSumSubArray is "+maxSum);
    }
}
