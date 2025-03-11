package com.ps.dsa.problems_100;

public class ReverseLinkedList_21 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        //1 2 3 4 5
        System.out.println("Before Reversing the Linkedlist");
        printLinkedList(head);
        Node reversedhead=reverseLinkedList(head);
        System.out.println("\nAfter Reversing the Linkedlist");
        printLinkedList(reversedhead);
    }

    private static void printLinkedList(Node reversedhead) {
        Node temp=reversedhead;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
    }

    private static Node reverseLinkedList(Node head) {
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
