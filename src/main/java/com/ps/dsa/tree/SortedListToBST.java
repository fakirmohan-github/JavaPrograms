package com.ps.dsa.tree;

class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data=data;
        next=null;
    }
}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}

class ListToBSTUtil{
    public TreeNode convertListToBST(ListNode node){
        return null;

    }

}

public class SortedListToBST {
    public static void main(String[] args) {
        ListToBSTUtil l=new ListToBSTUtil();
        ListNode ln=new ListNode(1);
        ln.next=new ListNode(2);
        ln.next.next=new ListNode(3);
        ln.next.next.next=new ListNode(4);
        ln.next.next.next.next=new ListNode(5);
        ln.next.next.next.next.next=new ListNode(6);
        ln.next.next.next.next.next.next.next=new ListNode(7);
        ln.next.next.next.next.next.next.next.next=new ListNode(8);





    }
}
