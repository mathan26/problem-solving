package com.github.mathan26.concepts.hashcodeandequals;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        A obj1 = new A("Mathan", 1);
        A obj2 = new A("Mathan", 1);
        //in case of name also Mathan it in the equals comparsion returns true.
        //why bcoz it is referring the same memory in the location.that's weird
        // To understand recall constant pool technology.


        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        if (obj1.hashCode() == obj2.hashCode()) {
            if (obj1.equals(obj2)) {
                System.out.println("Both Objects are equal");
            } else {
                System.out.println("Both Objects not are equal");
            }
        } else {
            System.out.println("Both Objects not are equal");
        }

        Map<A, String> map = new HashMap<A, String>();
        map.put(obj1, "CSE");
        map.put(obj2, "IT");

        for (A geek : map.keySet()) {
            System.out.println(map.get(geek).toString());
        }
    }
}
