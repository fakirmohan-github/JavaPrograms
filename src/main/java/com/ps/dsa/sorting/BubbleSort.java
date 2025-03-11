package com.ps.dsa.sorting;

/*

Push the maximum to the last by adjacant swap

Steps of the Bubble Sort Algorithm:
1. Start from the first element in the list.
2. Compare each pair of adjacent elements:
3. If the current element is greater than the next, swap them.Otherwise, leave them in place.
4. After completing one pass, the largest element has "bubbled up" to the end of the list.
5. Repeat the process for the remaining unsorted portion of the list (excluding the last element, which is now correctly placed).
6. Continue until no swaps are needed.

Time Complexity:
Best case: O(n) (if the list is already sorted, only one pass is needed, and no swaps will occur).
Worst case: O(n²) (when the list is sorted in reverse order).
Average case: O(n²) (if the list is randomly ordered).
Space Complexity:
O(1) because Bubble Sort is an in-place sorting algorithm and does not require extra space aside from a few variables.

*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {12,3,42,45,63,53,1,4};
        swapUsingBubbleSort(arr);
        for(int i : arr)
            System.out.print(" "+i);
    }

    private static void swapUsingBubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=n-2 ; i>0 ; i--){
            for(int j=0 ; j<n-1 ; j++) {
                if(arr[j]>arr[j+1])
                    swapMaxToRight(arr,j,j+1);
            }
        }
    }

    private static void swapMaxToRight(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
