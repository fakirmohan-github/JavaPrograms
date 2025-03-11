package com.ps.java8.stream;

//used for logging in stream processing

import java.util.Optional;
import java.util.stream.IntStream;

public class PeekExample {
    public static void main(String[] args) {
        int res=IntStream.of(1,2,3,4,5)
                .limit(3)
                .peek(i->System.out.print("  "+i))
                .sum();//sum is the reduction method -->
        System.out.println("\n Result "+res);

    }
}
