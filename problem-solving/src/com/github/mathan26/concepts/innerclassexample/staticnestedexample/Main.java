package com.github.mathan26.concepts.innerclassexample.staticnestedexample;

class Outer {
    static class NestedInnerClass {
        public void display() {
            System.out.println("Inside static class method!");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Outer.NestedInnerClass obj = new Outer.NestedInnerClass(); // No need of creating the Outer class object
        obj.display();
    }
}
