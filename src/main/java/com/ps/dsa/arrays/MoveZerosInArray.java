package com.ps.dsa.arrays;

/*

Move Zeroes to the End: Given an array of integers, move all the zeroes to the end of the array
while maintaining the relative order of non-zero elements.

*/

/*

Approach:

Two Pointers:
Use one pointer i to iterate over the array, and another pointer lastNonZeroFoundAt to keep track
of the position where the next non-zero element should be placed.
If the current element is non-zero, swap it with the element at lastNonZeroFoundAt and then
increment lastNonZeroFoundAt.
Continue iterating through the array.

Result: By the end of the iteration, all the non-zero elements are moved to the beginning of the
array, and the zeroes are pushed towards the end.

 */

/*

Explanation of the Code:
moveZeroes(int[] nums) Function:

We initialize a pointer lastNonZeroFoundAt at index 0. This pointer keeps track of the index where the next non-zero element should be placed.
We then iterate through the array with the i pointer:
If nums[i] != 0, it means we found a non-zero element. We swap it with the element at lastNonZeroFoundAt.
After the swap, we increment lastNonZeroFoundAt to point to the next position for a non-zero element.
This process ensures that non-zero elements move to the front and zeroes naturally move to the end.
Time and Space Complexity:

Time Complexity: O(n), where n is the length of the array. We only loop through the array once.
Space Complexity: O(1). We are only using a constant amount of extra space for variables like lastNonZeroFoundAt and temp.
Example Walkthrough:
Consider the input array {0, 1, 0, 3, 12}:

Initially, lastNonZeroFoundAt = 0.
For i = 0, nums[0] == 0, so we continue.
For i = 1, nums[1] == 1 (non-zero), so we swap nums[1] with nums[0]. Now, the array becomes {1, 0, 0, 3, 12} and lastNonZeroFoundAt is incremented to 1.
For i = 2, nums[2] == 0, so we continue.
For i = 3, nums[3] == 3 (non-zero), so we swap nums[3] with nums[1]. Now, the array becomes {1, 3, 0, 0, 12} and lastNonZeroFoundAt is incremented to 2.
For i = 4, nums[4] == 12 (non-zero), so we swap nums[4] with nums[2]. Now, the array becomes {1, 3, 12, 0, 0} and lastNonZeroFoundAt is incremented to 3.
Final array: {1, 3, 12, 0, 0}

*/


public class MoveZerosInArray {

    public static void main(String[] args) {
        int[] intArr={23,0,1,0,3,12};
        moveZeros(intArr);
        for(int i : intArr)
            System.out.println(i+" ");
    }

    private static void moveZeros(int[] intArr) {
        int lastNonZeroFoundAt=0;
        for(int i=0 ; i<intArr.length ; i++){
            if(intArr[i] != 0){
                int temp = intArr[i];
                intArr[i]=intArr[lastNonZeroFoundAt];
                intArr[lastNonZeroFoundAt]=temp;
                lastNonZeroFoundAt++;
            }
        }
    }

}
