package com.github.mathan26.concepts.couplinginjava.loosecoupling;

public class TopicOneImpl implements Topic{
    @Override
    public void understand() {
        System.out.println("Understand! From Topic 1 class");
    }
}
