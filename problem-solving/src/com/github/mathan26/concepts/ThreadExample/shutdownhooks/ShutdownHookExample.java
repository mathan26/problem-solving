package com.github.mathan26.concepts.ThreadExample.shutdownhooks;


public class ShutdownHookExample {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new ThreadA());
        System.out.println("Main Threading Running!");
        // check the number of processors available
        System.out.println("" + Runtime.getRuntime()
                .availableProcessors());
        // run the garbage collector
        Runtime.getRuntime().gc();
        // print the maximum memory
        System.out.println("" + Runtime.getRuntime().maxMemory());
        System.out.println("Gonna call System.exit()");
        System.exit(0);
    }
}

class ThreadA extends Thread {
    public void run() {
        System.out.println("########################");
        System.out.println("addShutdownHook called! ");
        System.out.println("Doing Clean up process!!!!");
    }
}
