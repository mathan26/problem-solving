package com.github.mathan26.concepts.shallowcopyvsdeepcopy;

public class A implements Cloneable {
    private String name;

    public A(String name) {
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
