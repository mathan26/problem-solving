package com.github.mathan26.concepts.innerclassexample;

public class Outer {
    class Inner{
        public void innerClassMethod(){
            System.out.println("Inside inner class");
        }


    }
    public void outterClassMethod(){
        System.out.println("Calling using outter class method!");
        Inner inner = new Inner();
        inner.innerClassMethod();
    }
    public static void main(String[] args) {
        Outer outer =new Outer();
        Outer.Inner inner = outer.new Inner();
        //Outer.Inner inner = new Outer().new Inner();  // another way
        inner.innerClassMethod();
        outer.outterClassMethod();
    }
}
