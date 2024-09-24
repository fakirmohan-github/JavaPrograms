package com.ps.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumInList {
    public static void main(String[] args) {
        List<Number> numList= Arrays.asList(12,32,2,44,3,49);
        Optional<Number> secondLargestNum=numList.stream()
                .distinct()//Remove the dup elements
                .sorted(Collections.reverseOrder())//sorting in descending order
                .skip(1)//skip the largest number
                .findFirst();//pick the 2nd largest number
        secondLargestNum.ifPresent(num->System.out.println("Second Highest Number is :: "+num));
    }
}
