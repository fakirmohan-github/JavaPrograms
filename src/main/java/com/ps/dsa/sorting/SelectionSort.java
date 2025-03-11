package com.ps.dsa.sorting;

/*

Selection Sort is a simple comparison-based sorting algorithm.
It repeatedly selects the smallest (or largest, depending on the sorting order) element from the unsorted part of the list and swaps it with the element at the beginning of the unsorted part.
This process is repeated until the entire list is sorted.

Steps for Selection Sort:
1. Start with the first element in the list.
2. Find the minimum (or maximum) element in the unsorted portion of the list (from the current position to the end).
3. Swap the found minimum (or maximum) element with the element at the current position.
4. Move to the next element in the list and repeat the process until the entire list is sorted.


Time Complexity:
Best, Average, and Worst case: O(n²), because it involves two nested loops (one for the selection process and one for comparison).
Space Complexity:
O(1), since it sorts the array in place without requiring additional space.

 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={23,43,1,34,64,14};
        int n=arr.length;
        for(int i=0 ; i< n-2 ; i++){
            int min=i;
            for(int j=i ; j<n ; j++){
                if(arr[min]>arr[j])
                    swapBoth(arr,min,j);
            }
        }
        for(int i : arr)
            System.out.print(" "+i);
    }

    private static void swapBoth(int[] arr,int min, int j) {
        int temp=arr[min];
        arr[min]=arr[j];
        arr[j]=temp;
    }

}
