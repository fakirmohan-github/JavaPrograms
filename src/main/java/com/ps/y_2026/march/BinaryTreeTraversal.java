package com.ps.y_2026.march;

class Node{
    int data;
    Node left, right;
    public Node(){
    }
    Node(int data, Node left, Node right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class BinaryTree{
    Node root;
    public void printPreOrder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    public void printInOrder(Node root){
        if(root==null)return;
        printInOrder(root.left);
        System.out.print(root.data+" ");
        printInOrder(root.right);
    }
    public void printPostOrder(Node root){
        if(root==null)return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data+" ");
    }
}

public class BinaryTreeTraversal {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root= new Node(1);
        bt.root.left=new Node(2);
        bt.root.right=new Node(3);
        bt.root.left.left=new Node(4);
        bt.root.left.right=new Node(5);
        bt.root.right.left=new Node(6);
        bt.root.right.right=new Node(7);

        System.out.println("------Pre Order Traversal -------");
        bt.printPreOrder(bt.root);
        System.out.println("\n------In Order Traversal -------");
        bt.printInOrder(bt.root);
        System.out.println("\n------Post Order Traversal -------");
        bt.printPostOrder(bt.root);
    }
}
