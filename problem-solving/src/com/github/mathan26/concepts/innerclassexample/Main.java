package com.github.mathan26.concepts.innerclassexample;

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.innerClassMethod();
        o.outterClassMethod();
    }
}
