package com.ps.dsa.arrays_practice;

public class LargestSumSubArray {
    static int larsum = 0;

    public static void main(String[] args) {
        int[] intArr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        largestSumSubArray(intArr, 0, 0);
        System.out.println("Largest Sum of SubArray is : " + larsum);

    }

    private static void largestSumSubArray(int[] intArr, int s, int e) {
        if (e == intArr.length)
            return;
        else if (s > e)
            largestSumSubArray(intArr, 0, e + 1);
        else {
            int tempSum = 0;
            for (int i = s; i <= e; i++) {
                tempSum = tempSum + intArr[i];
            }
            if (tempSum > larsum)
                larsum = tempSum;
            largestSumSubArray(intArr, s + 1, e);

        }
    }
}