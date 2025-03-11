package com.ps.dsa.tree;

class Node{
    int data;
    Node left,right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data) {
        this.data = data;
        left=right=null;
    }

    public Node() {
    }

}

class BinaryTree {
    Node root;
    public void printPreOrder(Node node){
        if(node == null)
            return;
        System.out.print(node.data+" ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    public void printInOrder(Node node){
        if(node == null)
            return;
        printInOrder(node.left);
        System.out.print(node.data+" ");
        printInOrder(node.right);
    }
    public void printPostOrder(Node node){
        if(node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data+" ");
    }
}

public class BinaryTreeTraversal {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.root=new Node(1);
        bt.root.left=new Node(2);
        bt.root.right=new Node(3);
        bt.root.left.left=new Node(4);
        bt.root.left.right=new Node(5);
        bt.root.right.left=new Node(6);
        bt.root.right.right=new Node(7);
        System.out.println("\n -------  Pre-Order Traversal  --------");
        bt.printPreOrder(bt.root);
        System.out.println("\n -------  In-Order Traversal  --------");
        bt.printInOrder(bt.root);
        System.out.println("\n -------  Post-Order Traversal  --------");
        bt.printPostOrder(bt.root);
    }
}
