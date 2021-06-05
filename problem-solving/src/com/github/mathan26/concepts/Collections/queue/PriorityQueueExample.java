package com.github.mathan26.concepts.Collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(10);
        priorityQueue.add(100);
        priorityQueue.add(10);
        priorityQueue.add(20);

        System.out.println(priorityQueue);
        //Remove based on least priority
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());


        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(10,(a,b)->b-a);
        priorityQueue2.add(100);
        priorityQueue2.add(10);
        priorityQueue2.add(20);
        System.out.println(priorityQueue2);
        System.out.println(priorityQueue2.poll());
        System.out.println(priorityQueue2.poll());
    }
}
