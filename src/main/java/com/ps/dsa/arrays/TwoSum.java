package com.ps.dsa.arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8}; // Given sorted array
        int target = 10;  // Target sum

        int[] result = findTwoSum(arr, target);

        if (result != null) {
            System.out.println("Pair found: " + arr[result[0]] + ", " + arr[result[1]]);
        } else {
            System.out.println("No pair found.");
        }
    }

    public static int[] findTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[] { left, right };  // Return indices of the pair
            } else if (sum < target) {
                left++;  // Move left pointer to the right to increase the sum
            } else {
                right--;  // Move right pointer to the left to decrease the sum
            }
        }
        return null;  // No pair found
    }
}
