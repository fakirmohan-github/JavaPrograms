package com.ps.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateEntriesShashwat {
    public static void main(String[] args) {
        List<String> nameList= Arrays.asList(
                "Emma", "Liam", "Olivia", "Noah", "Ava",
                "Emma", "Isabella", "Mason", "Mia", "Liam",
                "Sophia", "Jacob", "Amelia", "Elijah", "Ava",
                "Harper", "William", "Evelyn", "Olivia", "James",
                "Charlotte", "Benjamin", "Isla", "Lucas", "Emma",
                "Noah", "Grace", "Oliver", "Isabella", "Henry","Emma"
        );

        nameList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .forEach((x,y)->System.out.print(x+"="+y+" "));
        System.out.println("");

        //using java 8 features
        findDupElements(nameList);

        //without using any predefined methods
        findDupElementsWithNoInbuiltFun(nameList);
    }

    private static void findDupElementsWithNoInbuiltFun(List<String> nameList) {
        HashMap<String,Integer> eleWithFreq=new HashMap();
        for(int i=0; i<nameList.size();i++){
            if(eleWithFreq.get(nameList.get(i))!=null)
                eleWithFreq.put(nameList.get(i),eleWithFreq.get(nameList.get(i))+1);
            else
                eleWithFreq.put(nameList.get(i),1);
        }
        System.out.println(eleWithFreq);
    }

    private static void findDupElements(List<String> nameList) {
        Map<String,Long> elementsWithCount=
                nameList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(elementsWithCount);
    }

}
