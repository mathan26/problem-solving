package com.github.mathan26.concepts.stringexamples;

public class StringEqCheck {
    public static void main(String[] args) {
        String name = "Mathan";
        String name2 = "Mathan";
        System.out.println(name == name2);
        String name3 = new String("Mathan");
        System.out.println(name == name3);
        String name4 = new String("Mathan");
        System.out.println(name4 == name3);


        // If use "new" new ref created
        // DIrectly created it will ref to the String constant pool
    }
}
