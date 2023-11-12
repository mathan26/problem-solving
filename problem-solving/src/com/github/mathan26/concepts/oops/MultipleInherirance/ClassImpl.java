package com.github.mathan26.concepts.oops.MultipleInherirance;

public class ClassImpl extends Class1 implements Inter1 {

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.displayName("Hello");

        Inter1 inter1 = new Class2();
        inter1.displayName("There");
    }
}
