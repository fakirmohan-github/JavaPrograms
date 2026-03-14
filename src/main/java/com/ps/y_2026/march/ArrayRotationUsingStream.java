package com.ps.y_2026.march;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayRotationUsingStream {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        rotateArray(arr,k);
    }

    private static void rotateArray(Integer[] arr, int k) {
        Integer[] result=Stream.concat(
                Arrays.stream(arr,arr.length-k,arr.length),
                Arrays.stream(arr,0,arr.length-k))
                .toArray(Integer[]::new);
        Arrays.stream(result).forEach(i->System.out.print(i+" "));
    }
}
