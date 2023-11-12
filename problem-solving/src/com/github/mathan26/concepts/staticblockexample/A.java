package com.github.mathan26.concepts.staticblockexample;

public class A {
    public static int staticVariable = 0; // this is static variable
    int nonStaticVariable = 0; //instance variable

    private static void staticMethod() {
        staticVariable++;
        // nonStaticVariable++; //Non-static field 'nonStaticVariable' cannot be referenced from a static context
        // notStaticMethod();                  // COMPILER TIME ERROR

        //Then how you can access?

        //Simple Just Create an instance of the class ,then access.

        A obj = new A();
        obj.nonStaticVariable++;
        obj.notStaticMethod();


    }

    private void notStaticMethod() {
        staticVariable++;  // static variable able to access in the non-static method
        //staticMethod(); //static method also callable from non-static method
        //Line commented otherwise it be repeatedly call these methods.
    }
}
