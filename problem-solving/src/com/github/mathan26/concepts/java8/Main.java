package com.github.mathan26.concepts.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "Love", "you", "too"));

        //java 7
        for (String str : list) {
            if (str.length() > 3) {
                System.out.println(str);//Love
            }
        }

        // Use forEach () combined with anonymous inner class to iterate
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if (s.length() > 3)
                    System.out.println(s);//Love
            }
        });

        //Lamda
        list.forEach(s -> {
                    if (s.length() > 3)
                        System.out.println(s);//Love
                }
        );

        //Requirements: Suppose there is a list of strings, and you need to delete all the strings with a length greater than 3.
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().length()>3){
                iterator.remove();
            }
        }
        System.out.println(list);//[I, you, too]
        list = new ArrayList<>(Arrays.asList("I", "Love", "you", "too"));

        //annonymous class
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>3;
            }
        });
        System.out.println(list);//[I, you, too]

        list = new ArrayList<>(Arrays.asList("I", "Love", "you", "too"));
        //Lamda
        list.removeIf(s->s.length()>3);
        System.out.println(list);//[I, you, too]
    }
}
