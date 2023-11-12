package com.github.mathan26.concepts.ThreadExample.synchronizationexample;

public class Display {
    public synchronized void wish(String name) {  //synchronized Each thread will wait until the completion of another thread
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " ,Good Morning!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
