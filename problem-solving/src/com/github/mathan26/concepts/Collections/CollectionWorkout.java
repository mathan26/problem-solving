package com.github.mathan26.concepts.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionWorkout {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.rotate(arrayList, 4);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.swap(arrayList, 0, 1);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(arrayList);

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(-3);
        arrayList2.add(-5);
        arrayList2.add(7);

        System.out.println("Collections.max() " + Collections.max(arrayList2));
        System.out.println("Collections.min() " + Collections.min(arrayList2));
        System.out.println("Collections.replaceAll() " + Collections.replaceAll(arrayList2, -3, 3));
        System.out.println("Collections.frequency() " + Collections.frequency(arrayList2, -3));
        System.out.println(Collections.indexOfSubList(arrayList, arrayList2));
        System.out.println(Collections.binarySearch(arrayList, 7));
    }
}
