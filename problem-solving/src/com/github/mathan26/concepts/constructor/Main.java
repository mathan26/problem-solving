package com.github.mathan26.concepts.constructor;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        B b=new B();
        b.name="Mathan";


        String s1="A";
        String s2="A";

        String s3 = new String("A");
        String s4=new String("A");
        System.out.println(s1==s2); //true
        System.out.println(s1==s3);//false
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//true


    }
}
