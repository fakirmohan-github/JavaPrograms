package com.ps.dsa.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class RotateArrayUsingStream {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        rotateArrayUsingStream(arr,k);
    }

    private static void rotateArrayUsingStream(Integer[] arr, int k) {
        int n=arr.length;
        Integer[] result=Stream.concat(Arrays.stream(arr,n-k,n),
                Arrays.stream(arr,0,n-k))
                .toArray(Integer[]::new);
        for(int i:result)
            System.out.print(" "+i);
    }
}
