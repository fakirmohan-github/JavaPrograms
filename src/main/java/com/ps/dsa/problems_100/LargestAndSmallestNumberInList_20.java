package com.ps.dsa.problems_100;

import java.util.stream.IntStream;

public class LargestAndSmallestNumberInList_20 {
    public static void main(String[] args) {
        int[] arr={1,4,2,1,44,6};
        Integer max=IntStream.of(arr)
                .boxed()
                .max(Integer::compare)
                .get();
        System.out.println("Highest Number is "+max);
        Integer min=IntStream.of(arr)
                .boxed()
                .min(Integer::compare)
                .get();
        System.out.println("Smallest Number "+min);
    }
}
