package com.ps.dsa.sorting;

import java.util.Arrays;


public class MergeSort1 {
    static int[] arr = {2, 3, 1, 4, 0};  // Input array
    static int n = arr.length - 1;  // High index of array
    static int[] temp = new int[arr.length];  // Temporary array for merging

    public static void main(String[] args) {
        mergeSort(arr, 0, n);  // Perform merge sort
        System.out.println("Sorted Array: " + Arrays.toString(arr));  // Print sorted array
    }

    // Recursive mergeSort function
    private static void mergeSort(int[] arr, int low, int high) {
        if (low == high)  // Base case: single element is already sorted
            return;

        int mid = (low + high) / 2;  // Find the midpoint
        mergeSort(arr, low, mid);  // Recursively sort the left half
        mergeSort(arr, mid + 1, high);  // Recursively sort the right half
        merge(arr, low, high, mid);  // Merge the two sorted halves
    }

    // Merging two sorted halves of the array
    private static void merge(int[] arr, int low, int high, int mid) {
        int left = low;  // Left subarray
        int right = mid + 1;  // Right subarray
        int tempIndex = low;  // Start index for the temp array

        // Merge the two sorted halves into temp[]
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[tempIndex] = arr[left];
                left++;
            } else {
                temp[tempIndex] = arr[right];
                right++;
            }
            tempIndex++;
        }

        // Copy any remaining elements from the left subarray (if any)
        while (left <= mid) {
            temp[tempIndex] = arr[left];
            left++;
            tempIndex++;
        }

        // Copy any remaining elements from the right subarray (if any)
        while (right <= high) {
            temp[tempIndex] = arr[right];
            right++;
            tempIndex++;
        }

        // Copy the merged elements from temp[] back to the original arr[]
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }
}
