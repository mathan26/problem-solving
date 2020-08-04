package com.github.mathan26.concepts.Collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(10);
        priorityQueue.add(100);
        priorityQueue.add(10);
        priorityQueue.add(20);

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
