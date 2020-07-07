package com.github.mathan26.concepts.ThreadExample.concurrencyissues;

public class Counter {
    int count = 0;

    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
