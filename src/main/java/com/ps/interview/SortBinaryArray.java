package com.ps.interview;

public class SortBinaryArray {
    public static void sortBinaryArray(int[] arr) {
        int countZero = 0;

        // Count number of 0s
        for (int num : arr) {
            if (num == 0) {
                countZero++;
            }
        }

        // Fill the array with 0s and 1s
        for (int i = 0; i < arr.length; i++) {
            if (i < countZero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};
        sortBinaryArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
