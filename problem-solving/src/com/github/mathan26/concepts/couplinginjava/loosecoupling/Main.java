package com.github.mathan26.concepts.couplinginjava.loosecoupling;

//loose coupling means they are mostly independent.
public class Main {
    public static void main(String[] args) {
        //At run time  we can change implementation!
        Topic obj = new TopicTwoImpl();
        //new TopicOneImpl();
        obj.understand();
    }
}
