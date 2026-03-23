package com.ps.collection;
import java.util.*;

public class SearchList {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList();
        List<Integer> llList = new LinkedList<>();

        intList.add(23);
        intList.add(33);
        intList.add(43);

        llList.add(13);
        llList.add(23);
        llList.add(53);

        System.out.println("Element is Present :: "+intList.contains(33));
        System.out.println("Element is present :: "+llList.contains(23));

        System.out.println("Element is Present :: "+intList.contains(13));
        System.out.println("Element is present :: "+llList.contains(33));

        System.out.println("Element is Present ::"+searchItem(intList,33));
        System.out.println("Element is Present ::"+searchItem(llList,23));
        System.out.println("Element is Present ::"+searchItem(intList,13));
        System.out.println("Element is Present ::"+searchItem(llList,33));
    }

    private static boolean searchItem(List<Integer> intList, int i) {
        for(Integer item :intList){
            if(item==i)
                return true;
        }
        return false;
    }
}
