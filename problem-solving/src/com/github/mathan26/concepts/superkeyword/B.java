package com.github.mathan26.concepts.superkeyword;

public class B extends A {
    public B() {
        super(); // Must be a first statement //call the default constructor
        super.display();
    }

    public static void main(String[] args) {
        A obj = new A(); // Parent Object creation, Child constructor not called
        A obj1 = new B(); //Now called
    }
}
