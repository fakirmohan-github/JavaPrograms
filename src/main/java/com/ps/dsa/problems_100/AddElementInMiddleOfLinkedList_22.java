package com.ps.dsa.problems_100;


public class AddElementInMiddleOfLinkedList_22 {
    Node head;

    AddElementInMiddleOfLinkedList_22() {
        head = null;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        AddElementInMiddleOfLinkedList_22 obj = new AddElementInMiddleOfLinkedList_22();
        obj.addInFront(2);
        obj.addInFront(1);
        obj.addAtEnd(4);
        obj.addInMiddle(3);
        obj.printList();
    }

    private void addInMiddle(int i) {
        Node newNode=new Node(i);
        int len=0;
        Node temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        int mid=len/2;
        for(int j=0 ; j<mid ; j++){
            temp=temp.next;
        }
        Node temp1=temp.next;
        temp.next=newNode;
        newNode.next=temp1;

    }

    private void addAtEnd(int i) {
        Node newNode =new Node(i);
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
    }

    private void addInFront(int i) {
        Node newNode = new Node(i);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
