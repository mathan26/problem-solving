package com.github.mathan26.concepts.ThreadExample.creation;

public class MyThread extends Thread {
    public void run(){

        System.out.println("running thread name is:"+Thread.currentThread().getName());
        System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
        /*System.out.println(this.getName());
         for(int i=0;i<10;i++){*/
        //System.out.println("Child Thread");
      //}
    }

    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.setName("Thread-ONE");
        MyThread t2 = new MyThread();
        t2.setName("Thread-TWO");
        t.setPriority(1);
        t2.setPriority(10);
        t.start();
        t2.start();

       /* MyThread m1=new MyThread();
        MyThread m2=new MyThread();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();*/

       /* for(int i=0;i<10;i++){
       //     System.out.println("Main Thread");    AFTER COMMENTING ONLY THREAD PRIORITY EXECUTES AS MENTIONED
        }*/
    }
}

//Output can't predict