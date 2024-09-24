package com.ps.java10;

import java.util.List;

public class TypeInference {
    public static void main(String[] args) {
        List<String> name1=List.of("Fakir","Mohan");
        List<String> name2=List.of("Nayak","Chintu");
        List<List<String>> newList=List.of(name1,name2);
        System.out.println("Without Using var :: "+newList);
        var newList1=List.of(name1,name2);
        System.out.println("With var :: "+newList1);
        //Can not assign null to var
        //var newVar=null;
        for(List<String> name:newList1){
            name.stream().forEach(System.out::println);
        }
        for(var name:newList){
            name.stream().forEach(System.out::println);
        }
    }
}
