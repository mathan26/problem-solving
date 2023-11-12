package com.github.mathan26.concepts.basics;

public class PassByValueTest {
    public static void main(String[] args) {
        Student s1 = new Student("Mathan");
        Student s2 = new Student("Kumar");

        swap(s1, s2);
        System.out.println("After swap in Main:");
        System.out.println(s1.getName());
        System.out.println(s2.getName());
    }

    private static void swap(Student s1, Student s2) {
        Student temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("In Swap method:");
        System.out.println(s1.getName());
        System.out.println(s2.getName());
    }
}
