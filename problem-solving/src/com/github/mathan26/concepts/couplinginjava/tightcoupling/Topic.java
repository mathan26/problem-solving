package com.github.mathan26.concepts.couplinginjava.tightcoupling;

public class Topic {
    //If I change the method name ,it will affect the Subject class
    //beoz it is tightly coupled

    public  void understand(){
        System.out.println("Tight coupling concept");
    }
}
