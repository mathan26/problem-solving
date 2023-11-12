package com.github.mathan26.concepts.oops;

public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    Student() {
        System.out.println("Empty constructor parent");
    }

    public static void main(String[] args) {


        Student s = new Student("Mathan");
        System.out.println(s.name);
//        Person.display();
//        s1.displayInstance();
//
//        Student s2 = new Student();
    }

    public final static void display() {
        System.out.println("From Abstract");
    }

}
