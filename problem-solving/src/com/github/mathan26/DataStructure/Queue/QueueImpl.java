package com.github.mathan26.DataStructure.Queue;

public class QueueImpl {
    int size;
    int capacity;
    int front;
    int rear;
    int[] array;

    public QueueImpl(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity - 1;
        this.array = new int[capacity];
    }


    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue() + " dequeued from Queue");
        System.out.println("Front Item is: " + queue.front());
        System.out.println("Rear Item is: " + queue.rear());
    }

    private int rear() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.rear];
    }

    private int front() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.front];
    }

    private int dequeue() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        int item = this.array[this.front];
        this.front = (this.front + 1) % capacity;
        this.size -= 1;
        return item;
    }

    private boolean isEmpty(QueueImpl queue) {
        return queue.size == 0;
    }

    private void enqueue(int element) {
        if (isFull(this))
            return;
        this.rear = (rear + 1) % capacity;
        this.array[this.rear] = element;
        this.size += 1;
        System.out.println(element + " enqueued to queue.");

    }

    private boolean isFull(QueueImpl queue) {
        return queue.size == capacity;
    }
}
