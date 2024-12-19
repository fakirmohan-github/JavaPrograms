package com.ps.dsa.arrays;

/*

Find the Duplicate in an Array: Given an array of n integers,
find the duplicate number. Assume there is exactly one duplicate.

*/

/*

Approach: Floyd's Tortoise and Hare (Cycle Detection)

The array contains numbers between 1 and n-1 and has exactly one duplicate.
The idea is to treat the array as a linked list, where each element points to the next index
as defined by its value (i.e., if arr[i] = k, then i points to k).
This approach involves two pointers moving at different speeds (a slow pointer and a fast pointer)
to detect the cycle in the "linked list."

Steps:
Phase 1: Detecting the cycle

Use two pointers: slow and fast. The slow pointer moves one step at a time,
and the fast pointer moves two steps at a time.
If there is a cycle (which there will be because of the duplicate),
eventually the slow and fast pointers will meet inside the cycle.

Phase 2: Finding the entry point of the cycle (duplicate number)

After the slow and fast pointers meet, move one of the pointers back to the start
and keep the other pointer at the meeting point. Move both pointers one step at a time.
The point where they meet again will be the start of the cycle, which corresponds to the duplicate number.


Time Complexity:

O(n), where n is the size of the array. This is because both the slow and fast pointers move at most n steps in total.

Space Complexity:

O(1). We are only using a constant amount of extra space (two pointers), so the space complexity is constant.

*/

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] intArr={1,2,4,4,3};
        int dupNum=findDuplicate(intArr);
        System.out.println("Duplicate Number in the list is "+dupNum);
    }

    private static int findDuplicate(int[] intArr) {
        int slow=intArr[0];
        int fast=intArr[0];

        do {
            slow=intArr[slow];
            fast=intArr[intArr[fast]];
        }while (slow != fast);

        slow=intArr[0];

        while(slow != fast){
            slow=intArr[slow];
            fast=intArr[fast];
        }
        return slow;
    }
}
