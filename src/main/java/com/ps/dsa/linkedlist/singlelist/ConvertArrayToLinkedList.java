package com.ps.dsa.linkedlist.singlelist;

import java.util.Arrays;

public class ConvertArrayToLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public static void main(String[] args) {
        int[] arr={44,3,42,4,1,5};
        System.out.println("Given array is ");
        Arrays.stream(arr).forEach(i->System.out.print(" "+i));
        Node head=convertArrayToLinkedList(arr);
        System.out.print("\n"+head.data+"\n");
        //traversing the linked list
        Node temp=head;
        while(temp != null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        //Length of the Linked List
        int len=lengthOfLinkedList(head);
        System.out.println("\n Length of the Linked List is :: "+len);
    }

    private static int lengthOfLinkedList(Node head) {
        Node temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }

    private static Node convertArrayToLinkedList(int[] arr) {
        Node head=new Node(arr[0]);
        Node mover=head;

        for(int i=1 ; i<arr.length ; i++){
            Node newNode=new Node(arr[i]);
            mover.next=newNode;
            mover=newNode;
        }
        return head;
    }
}