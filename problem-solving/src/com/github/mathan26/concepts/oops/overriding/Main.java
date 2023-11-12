package com.github.mathan26.concepts.oops.overriding;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
//        parent.m1();    Cannot access since  it is private
        Child child = new Child();
//        child.m1();     Cannot call


        parent.m2(); // parent m2 method
        child.m2(); // Child m2 method


        Parent childRefOnParent = new Child(); // since overriding method resolution takes at runtime

        childRefOnParent.m2(); // Child m2 method

        childRefOnParent.m2(child);     // Child overloading
        childRefOnParent.m2(parent);    // Child overloading
        childRefOnParent.m3();          // static method in parent

        // Variable reference takes place based on the reference type

        System.out.println(childRefOnParent.name); // parent
        System.out.println(child.name);            // Child

    }
}
