package com.github.mathan26.concepts.ThreadExample.interthreadcommunication;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadA t = new ThreadA();
        t.start();
        Thread.sleep(1000);
        synchronized (t) {
            System.out.println("Main thread trying to call wait.");
            t.wait(1000);  // IF I NOT GIVE TIME LIMIT IT IS NEVER CALLED, HAVE TO CHECK WHATS GOING ON
            System.out.println("Main thread got notification");
            System.out.println(t.total);
        }
    }
}


class ThreadA extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("child thread starts notification");
            for (int i = 1; i <= 10; i++) {
                total = total + i;
                System.out.println(total);
            }
            System.out.println("Child thread trying to give notification");
            this.notify();
        }
    }
}
