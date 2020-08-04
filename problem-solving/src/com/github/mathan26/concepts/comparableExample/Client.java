package com.github.mathan26.concepts.comparableExample;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
    public static void main(String[] args) {
        Apple apple1=new Apple("variety 1",Color.RED,100);
        Apple apple2=new Apple("variety 2",Color.GREEN,200);
        Apple apple3=new Apple("variety 2",Color.GREEN,150);

        ArrayList<Apple> apples=new ArrayList(){
            {
                add(apple1);
                add(apple2);
                add(apple3);
            }
        };
        Collections.sort(apples);
        System.out.println(apples);
    }
}
