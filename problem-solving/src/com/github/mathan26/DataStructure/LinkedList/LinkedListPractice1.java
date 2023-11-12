package com.github.mathan26.DataStructure.LinkedList;

import java.util.Scanner;

public class LinkedListPractice1 {
    Scanner input = new Scanner(System.in);
    Node head;

    public static void main(String[] args) {
        LinkedListPractice1 linkedList = new LinkedListPractice1();
        linkedList.createList();
        linkedList.printList();
        linkedList.insertNodeAtBeginning();
        linkedList.printList();
        linkedList.insertNodeAtEnd();
        linkedList.printList();
        linkedList.insertAtGivenPosition();
        linkedList.printList();

        linkedList.deleteBeginningNode();
        linkedList.printList();
        linkedList.deleteLastNode();
        linkedList.printList();
        linkedList.deleteTheKey();
        linkedList.printList();
        linkedList.reverseLinkedList();
        linkedList.printList();
    }

    private void reverseLinkedList() {
        Node prev = null;
        Node current = head;
        Node next = null;
        System.out.println("Reversed List");
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }

    private void deleteTheKey() {
        System.out.println("Enter the key to delete");
        int key = input.nextInt();
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("key not present");
        }
        prev.next = temp.next;

    }

    private void deleteLastNode() {
        System.out.println("deleting the last node");
        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    private void deleteBeginningNode() {
        System.out.println("First Node will be deleted");
        if (head.next != null) {
            head = head.next;
            System.out.println("First Node deleted");
        }
    }

    private void insertAtGivenPosition() {
        System.out.println("Enter the position to add the data");
        int position = input.nextInt();
        System.out.println("Enter ther data to insert");
        int data = input.nextInt();
        int iteration = 0;
        Node prev = null;
        Node current = head;

        if (position == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        } else {
            while (current != null && iteration <= (position - 1)) {
                if (current.next == null) {
                    Node newNode = new Node(data);
                    current.next = newNode;
                    break;
                } else if (position - 1 == iteration) {
                    Node newNode = new Node(data);
                    newNode.next = current;
                    prev.next = newNode;
                    break;
                } else {
                    prev = current;
                    current = current.next;
                    iteration++;
                }
            }

        }
    }

    private void insertNodeAtEnd() {
        System.out.println("Enter the data to add at the end of list: ");
        int data = input.nextInt();
        Node newNode = new Node(data);

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    private void insertNodeAtBeginning() {
        System.out.println("Enter the node to add at beginning");
        int data = input.nextInt();
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private void createList() {
        System.out.println("Enter the Number of node to create and data's");
        int n = input.nextInt();
        int i = 0;
        while (i < n) {
            int data = input.nextInt();
            if (head == null) {
                head = new Node(data);
            } else {
                Node newNode = new Node(data);
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            i++;
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
}
