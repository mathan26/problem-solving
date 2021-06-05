package com.github.mathan26.concepts.ThreadExample.producerconsumer;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final PC pc= new PC();
        // Create producer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
    }
}


class PC{
    int capacity = 2;
    LinkedList<Integer> queue  = new LinkedList<>();
    public void produce() throws InterruptedException {
        int value = 0;
        while (true){
            synchronized (this){
                while (queue.size()==capacity){
                    this.wait();
                }
                queue.add(value++);
                System.out.println("Produced "+value);
                this.notify();
            }

        }
    }
    public  void consume() throws InterruptedException {
        while (true){
            synchronized (this){
                while (queue.isEmpty()){
                    this.wait();
                }
                System.out.println("Consumed  "+queue.removeFirst());
                this.notify();
                Thread.sleep(1000);
            }

        }
    }

}