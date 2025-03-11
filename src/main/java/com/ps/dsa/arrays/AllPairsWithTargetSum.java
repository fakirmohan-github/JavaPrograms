package com.ps.dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class AllPairsWithTargetSum {

    // Function to find and print all pairs with the given target sum
    public static void findAllPairsWithTargetSum(int[] arr, int target) {
        // Set to store the numbers we've seen so far
        Set<Integer> seen = new HashSet<>();
        // Set to store the pairs to avoid printing duplicates
        Set<String> pairs = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            // Check if the complement is already in the set
            if (seen.contains(complement)) {
                // Create a string representation of the pair to avoid duplicate pairs
                String pair = Math.min(num, complement) + "," + Math.max(num, complement);
                pairs.add(pair); // Add the pair to the set
            }

            // Add the current number to the set
            seen.add(num);
        }

        // Print the pairs found
        if (pairs.isEmpty()) {
            System.out.println("No pairs found with target sum " + target);
        } else {
            for (String pair : pairs) {
                System.out.println("Pair found: (" + pair + ")");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 2, 15, 8, 1,1};
        int target = 9;

        findAllPairsWithTargetSum(arr, target);
    }
}
