package com.github.mathan26.leetcode.challenges.april;

class MinStack {
    private Node head;

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(-1);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();
    }

    public void push(int x) {
        if (head == null)
            head = new Node(x, x);
        else
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min) {
            this(val, min, null);
        }

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
