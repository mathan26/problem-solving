package com.github.mathan26.concepts.innerclassexample;

import javax.crypto.spec.PSource;

class A{

    public void calculate(){
        int x=10;
        class B{
            public void sum(int a,int b){
                System.out.println(x);
                System.out.println(a+b);
            }
        }
        B b = new B(); // Create object outer the class
        b.sum(10,20); //call the repeated method like below
        b.sum(100,200);
        b.sum(1000,200);
    }

}

public class MethodLocalInnerclass {
    public static void main(String[] args) {
        A obj = new A(); // create instance for outer class then call the method
        obj.calculate();
    }
}
