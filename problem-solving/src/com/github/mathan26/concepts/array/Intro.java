package com.github.mathan26.concepts.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intro {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] b= {1,2,3,4,5};
        List<Integer> B  = Arrays.stream(b).boxed().collect(Collectors.toList());
        arrayList = new ArrayList<>(B);//copy B array to arrayList
        System.out.println(arrayList.get(0)); //get the value in the specified index
        System.out.println(arrayList.removeIf(integer -> integer==5)); //predicate
        System.out.println(arrayList.add(6));       //append the value
        System.out.println(arrayList.set(0,100)); //remove the old index value
        System.out.println(arrayList);
    }
}
