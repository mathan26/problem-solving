package com.github.mathan26.concepts.ThreadExample.synchronizationexample;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display();
        MyThread t1 = new MyThread(d1,"Mathan");
        MyThread t2 = new MyThread(d1,"MathanKumar");
        t1.start();
        t2.start();
    }
}
