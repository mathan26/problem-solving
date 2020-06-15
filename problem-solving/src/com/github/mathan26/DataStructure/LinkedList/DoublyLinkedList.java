package com.github.mathan26.DataStructure.LinkedList;

import javax.sound.midi.Soundbank;
import java.awt.event.ItemEvent;
import java.nio.file.NotDirectoryException;
import java.util.Scanner;

public class DoublyLinkedList {
    Scanner input = new Scanner(System.in);
    Node head;

    class Node{
        Node prev;
        Node next;
        int data;
        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.addDataToFront();
        obj.addDataToFront();
        obj.addDataToFront();
        obj.addDataToFront();
        obj.addDataAtEnd();
        obj.afterGivenNode();
        obj.printList();
        obj.delAtFront();
        obj.printList();
        obj.delAtLast();
        obj.printList();
        obj.deleteAtMiddle();
        obj.printList();
    }

    private void deleteAtMiddle() {
        System.out.println("Enter the position to delete the Node");
        int position=input.nextInt();
        Node temp=head;
        int iteration=0;
        while (temp!=null && position -1!=iteration){
            temp=temp.next;
            iteration++;
        }
        deleteAtMiddleNode(temp,position);
    }

    private void deleteAtMiddleNode(Node delNode,int position) {
        System.out.println("deleting at middle.");
        delNode.prev.next=delNode.next;
        delNode.next.prev=delNode.prev;
    }

    private void delAtLast() {
        System.out.println("deleting the node at end.");

        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }

        temp.prev.next=null;
        temp.prev=null;

    }

    private void delAtFront() {
        System.out.println("deleting the node at front.");
            head=head.next;
            head.prev=null;

    }

    private void afterGivenNode() {
        System.out.println("Enter the data to add At middle:");
        int data=input.nextInt();
        System.out.println("Enter the position to add the node");
        int position = input.nextInt();
        Node temp=head;
        int iterateCount=0;
        while (temp!=null && iterateCount!=position-1){
            temp=temp.next;
            iterateCount++;
        }
        if(temp==null){
            System.out.println("position not valid");
            return;
        }

        addAfterNode(temp,data);
        System.out.println("Node added");

    }

    private void addAfterNode(Node prev, int data) {
        Node newNode = new Node(data);
        newNode.next=prev.next;
        prev.next=newNode;
        newNode.prev=prev;

        if(newNode.next!=null){
            newNode.next.prev=newNode;
        }
    }

    private void addDataAtEnd() {
        System.out.println("Enter the data at last");
        int data=input.nextInt();
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;

    }

    private void printList() {
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    private void addDataToFront() {
        System.out.println("Enter the data to add at Front:");
        int data = input.nextInt();
        Node newNode = new Node(data);
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;
    }
}
