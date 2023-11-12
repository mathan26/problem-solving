package com.github.mathan26.DataStructure.LinkedList;


class Llist {
    Node head;

    class Node {
        Node next;
        int data;

        Node() {

        }

        Node(int data) {
            this.data = data;
        }
    }
}


public class FindtheLoopCount {

    public static void main(String[] args) {
        Llist llist = new Llist();
        llist.head = llist.new Node(1);
        llist.head.next = llist.new Node(2);
        llist.head.next.next = llist.new Node(3);
        llist.head.next.next.next = llist.new Node(4);
        llist.head.next.next.next.next = llist.new Node(5);

        //Create the loop
        llist.head.next.next.next.next.next = llist.head.next;

        //find loop starting point use the Floyd's Algorithm
        Llist.Node loopStart = findStartNode(llist.head);
        boolean isLoop = loopStart != null ? true : false;
        System.out.println("Is LinkedList is Loop : " + isLoop);
        if (isLoop) {
            int result = countNodes(loopStart);
            System.out.println("Loop Count " + result);
        }

    }

    private static int countNodes(Llist.Node loopStart) {
        Llist.Node temp = loopStart;
        int count = 1;
        while (temp.next != loopStart) {
            temp = temp.next;
            count++;
        }

        return count;
    }

    private static Llist.Node findStartNode(Llist.Node head) {
        Llist.Node p = head;
        Llist.Node q = head;

        while (p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;

            if (p == q) {
                return p;
            }
        }
        return null;
    }
}
