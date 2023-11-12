package com.github.mathan26.concepts.couplinginjava.tightcoupling;

public class Subject {
    Topic t = new Topic();

    public void startReading() {
        t.understand();
    }
}
