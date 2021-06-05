package com.github.mathan26.concepts.oops;


// Abstract class
public abstract class Person {
     String name;

    public Person() {
        System.out.println("Parent constructor called");
    }


    public Person(String name) {
        this.name = name;
    }

    protected static void display(){
        System.out.println("From Abstract");
    }

    protected   void displayInstance(){
        System.out.println("From Abstract");
    }
}
