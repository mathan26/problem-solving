package com.github.mathan26.concepts.oops.overriding;

public class Parent {

    String name = "parent";

    private void m1(){
        System.out.println("Parent private method");
    }

    public void m2() {
        System.out.println("parent m2 method");
    }

    public void m2(Parent parent) {
        System.out.println("Parent Overloading");
    }

    public static void m3() {
        System.out.println("static method in parent");
    }
}

class Child extends  Parent {

    String name = "Child";

    // This is not overriding, since parent method is invisible (private method)
    private void m1() {
        System.out.println("Child private method");
    }

    @Override
    public void m2() {
        System.out.println("Child m2 method");
    }

    // When argument is different this is overloading...
    // here method resolution will take place at runtime i.e #new ()
    public void m2(Parent child){
        System.out.println("Child overloading");
    }

//    Cannot override static method as instance in child and also instance cannot override as static
//    public void m3(){
//
//    }

    // it not overrding, because it is a static method .
    // called as method hiding!
    // compiler is responsible for resolution.
    public static void m3() {
        System.out.println("static method in child");
    }

}


