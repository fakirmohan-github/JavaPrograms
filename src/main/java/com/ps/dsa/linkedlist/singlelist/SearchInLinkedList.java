package com.ps.dsa.linkedlist.singlelist;

import java.util.LinkedList;

public class SearchInLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args) {
        //LinkedList<Integer>  llist=new LinkedList<>(Arrays.asList(14,54,21,4,1,4));
        LinkedList llist=new LinkedList<>();

        appendData(14);
        appendData(54);
        appendData(21);
        appendData(4);
        appendData(1);
        appendData(4);

        int searchEle=54;
        boolean isPresent=ifElementPresent(searchEle,llist);
        System.out.println(searchEle+" present in the list : "+isPresent);
    }

    private static void appendData(int i) {

    }

    private static boolean ifElementPresent(int searchEle, LinkedList<Integer> llist) {
        //Node head=llist.get(0);
        return false;
    }
}
