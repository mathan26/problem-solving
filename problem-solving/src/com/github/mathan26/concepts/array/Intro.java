package com.github.mathan26.concepts.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intro {
    public static void main(String[] args) {
//         According to the Java documentation, an array is an object containing a fixed number of values of the same type. The elements of an array are indexed, which means we can access them with numbers (called indices).

//      Declaration
        int[] array;

//      set values to the array directly when creating it:
        int[] anArray = new int[]{1, 2, 3, 4, 5};

//      accessing and setting the element
        anArray[0] = 10;
        System.out.println(anArray[0]);

//        Iterating the Array
        for (int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i]);
        }

//        foreach
        for (int element : anArray) {
            System.out.println(element);
        }

//      varArgs:  are used to pass an arbitrary number of arguments to a method:
        varargsMethod(anArray);

//        Transforming an Array into a List

        List<Integer> aList = new ArrayList<>();
        for (int element : anArray) {
            aList.add(element);
        }

        // another way,with some restrictions
        // 1. It's not possible to use an array of primitive types
        // 2. We can't add or remove elements from the created list, as it'll throw an UnsupportedOperationException
        Integer[] anArray2 = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> aList2 = Arrays.asList(anArray2);

//        From an Array to a Stream
        String[] anArray4 = new String[]{"Milk", "Tomato", "Chips"};
        Stream<String> aStream = Arrays.stream(anArray4);
        // subset also possible
        Stream<String> anotherStream = Arrays.stream(anArray4, 1, 3);

//        Searching in an Array
        int index = Arrays.binarySearch(anArray, 3);

//        Concatenating Arrays
        int[] anArray3 = new int[]{5, 2, 1, 4, 8};
        int[] anotherArray = new int[]{10, 4, 9, 11, 2};
        int[] resultArray = new int[anArray3.length + anotherArray.length];

//        int[] resultArray = new int[anArray3.length + anotherArray.length];
//        for (int i = 0; i < resultArray.length; i++) {
//            resultArray[i] = (i < anArray.length ? anArray3[i] : anotherArray[i - anArray.length]);
//        }
        System.arraycopy(anArray3, 0, resultArray, 0, anArray.length);
        System.arraycopy(anotherArray, 0, resultArray, anArray.length, anotherArray.length);
        System.out.println(Arrays.toString(resultArray)); // [5, 2, 1, 4, 8, 10, 4, 9, 11, 2]
    }


    static void varargsMethod(int... varargs) {
        /*
        The varargs usage is safe if and only if:
        https://www.baeldung.com/java-varargs
        We don't store anything in the implicitly created array. In this example, we did store a List<Integer> in that array
        We don't let a reference to the generated array escape the method (more on this later)
        If we are sure that the method itself does safely use the varargs, we can use @SafeVarargs to suppress the warning.

        Put simply, the varargs usage is safe if we use them to transfer a variable number of arguments from the caller to the method and nothing more!
        */
        System.out.println(Arrays.toString(varargs));
    }
}
