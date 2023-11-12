package com.github.mathan26.concepts.java8;


import java.util.function.Function;
import java.util.function.Predicate;

public class ExampleFucntionalInterfaces {
    public static void main(String[] args) {

        //Ex:1 Write a predicate to check whether the given integer is greater than 10 or not.

        Predicate<Integer> p = I -> (I > 10);
        System.out.println(p.test(6));

        int[] x = {0, 5, 10, 15, 20, 25, 30};
        Predicate<Integer> p2 = I -> I > 10;
        Predicate<Integer> p3 = I -> I % 2 == 0;
        System.out.println("The numbers greater than 10");
        method1(p2, x);
        System.out.println("Even no's are:");
        method1(p3, x);
        System.out.println("The numbers greater than 10 and even are:");
        method1(p2.and(p3), x);
        System.out.println("The numbers greater than 10 or even are:");
        method1(p2.or(p3), x);
        System.out.println("The numbers not greater than 10");
        method1(p2.negate(), x);

        //FUNCTIONS
        Function<String, Integer> f1 = s -> s.length();

        System.out.println("Mathankumar char length is: " + f1.apply("Mathankumar"));

        Function<String, String> f2 = Function.identity();
        System.out.println("it will print the input value " + f2.apply("Mathan"));

    }

    private static void method1(Predicate<Integer> predicate, int[] x) {
        for (int value : x) {
            if (predicate.test(value)) {
                System.out.println(value);
            }
        }
    }
}
