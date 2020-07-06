package com.github.mathan26.concepts.ThreadExample.methodtopreventthreadexe.join;

public class MyThread extends Thread {
    public void run(){
        try {
            for (int i=0;i<10;i++){
                System.out.println("Child Thread Executing...");
                Thread.sleep(100);  // Thread goes to sleep mode.
            }

        }catch (InterruptedException e){
            System.out.println("**************This thread got interrupted*************");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();   // IT Cause the current thread to wait until the t is completed
        MyThread t2 = new MyThread();
        t2.start();
        t2.interrupt(); //Interrupting the thread
        System.out.println("_________CHILD THREAD COMPLETED____________");

        Thread.sleep(100);
        for (int i=0;i<10;i++){
            System.out.println("Main Thread Executing...");
        }
    }
}
