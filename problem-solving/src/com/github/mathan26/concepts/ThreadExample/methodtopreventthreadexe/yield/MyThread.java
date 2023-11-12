package com.github.mathan26.concepts.ThreadExample.methodtopreventthreadexe.yield;

public class MyThread extends Thread {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.setName("Thread-ONE");
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }

    public void run() {

        System.out.println(this.getName());
        for (int i = 0; i < 10; i++) {
            //Yield() Method cause the current thread to stop it's execution
            Thread.yield();
            System.out.println("Child Thread");
        }
    }
}

//Output can't predict
