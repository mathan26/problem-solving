package com.github.mathan26.DataStructure.trees;

import com.github.mathan26.concepts.constructor.B;

import java.io.BufferedReader;
import java.util.Scanner;

public class BinarySearchTreeImpl {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Node root=null;
        root=insert(10,root);
        root=insert(5,root);
        root=insert(15,root);
        root=insert(7,root);
        root=insert(20,root);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int data= input.nextInt();
        search(root,data);
    }

    private static void search(Node root,int data) {
        if(root==null){
            System.out.println(data+" not found!");
        }else if(root.data==data){
            System.out.println(data+" found!");
        }else if(data<root.data){
            search(root.left,data);
        }else if(data>root.data){
            search(root.right,data);
        }
    }

    private static Node insert(int data,Node root) {
        if(root==null)
            root=new Node(data);

        if(data < root.data){
            root.left=insert(data,root.left);
        }else if(data>root.data){
            root.right=insert(data,root.right);
        }
        return root;
    }
}
