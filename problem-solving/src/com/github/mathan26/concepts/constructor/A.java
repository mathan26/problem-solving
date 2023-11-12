package com.github.mathan26.concepts.constructor;

public class A {
    String name;

    public A() {
        System.out.println("Parent Constructor");
    }

    public A(String name) {
        this.name = name;
    }
}
