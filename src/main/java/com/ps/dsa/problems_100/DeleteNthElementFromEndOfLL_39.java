package com.ps.dsa.problems_100;

public class DeleteNthElementFromEndOfLL_39 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        System.out.println("Before Delete ::");
        printLL(head);
        // 1 2 3 4 5   ---> 1 2 3 5
        Node newHead=deleteNthNodeFromLL(head,2);
        System.out.println("\nAfter Delete ::");
        printLL(newHead);
    }

    private static Node deleteNthNodeFromLL(Node head,int n) {
        Node temp=head;
        Node fast=head;
        Node slow=head;
        for(int i=0 ; i<n ; i++){
            fast=fast.next;
        }
        if(fast==null)
            return head.next;

        while(fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }
        Node deleteNode=slow.next;
        slow.next=slow.next.next;
        return head;
    }
}
