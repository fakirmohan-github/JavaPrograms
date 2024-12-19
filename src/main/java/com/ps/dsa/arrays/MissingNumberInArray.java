package com.ps.dsa.arrays;

/*

Find the Missing Number in an Array: Given an array containing n distinct numbers
taken from the range 1 to n+1, find the missing number.

*/

/*

Steps:
Calculate the expected sum of numbers from 1 to n+1.
Calculate the actual sum of the numbers in the array.
Subtract the actual sum from the expected sum to find the missing number.


Time Complexity:
The time complexity of this solution is O(n), where n is the length of the array,
because we are iterating through the array once to compute the sum.

Space Complexity:
The space complexity is O(1) because we are using only a few extra variables for the sums.

*/

public class MissingNumberInArray {
    public static void main(String[] args) {
        int intArr[]= {1,2,4,5,6};
        int missedNum=findMissingNumber(intArr);
        System.out.println("Missing Number is "+missedNum);
    }

    private static int findMissingNumber(int[] intArr) {
        int n=intArr.length;
        int expectedSum= (n+1)*(n+2)/2;
        int actualSum=0;
        for(int i : intArr)
            actualSum=actualSum+i;
        int missedNum=expectedSum-actualSum;
        return missedNum;
    }
}
