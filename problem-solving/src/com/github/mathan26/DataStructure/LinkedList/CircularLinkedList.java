package com.github.mathan26.DataStructure.LinkedList;

public class CircularLinkedList {
    public static void main(String[] args) {
        Node last = null;
        last = addToEmpty(last, 6);
        last = addBegin(last, 8);
        last = addBegin(last, 10);
        last = addEnd(last, 12);
        last = addEnd(last, 14);
        last = addAfter(last, 10, 8);
        traverse(last);

    }

    private static void traverse(Node last) {
        if (last == null) {
            System.out.println("List is empty");
        }

        Node p = last;
        do {
            System.out.print(p.data + " ");
            p = p.next;

        } while (last != p.next);
    }

    private static Node addAfter(Node last, int data, int item) {
        if (last == null) {
            return null;
        }

        Node p = last.next;
        do {
            if (p.data == item) {
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = p.next;
                p.next = newNode;

                if (p == last) {
                    last = newNode;
                    return last;
                }
                return last;
            }
            p = p.next;
        } while (p != last.next);
        System.out.println("Item Not present in the list");
        return last;
    }

    private static Node addEnd(Node last, int data) {
        if (last == null)
            addToEmpty(last, data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    private static Node addBegin(Node last, int data) {
        if (last == null)
            addToEmpty(last, data);

        Node temp = new Node();
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        return last;

    }

    private static Node addToEmpty(Node last, int data) {
        if (last != null) {
            return last;
        }

        Node temp = new Node();
        temp.data = data;
        last = temp;

        last.next = last;
        return last;
    }

    static class Node {
        int data;
        Node next;
    }
}
