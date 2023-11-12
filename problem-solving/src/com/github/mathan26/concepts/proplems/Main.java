package com.github.mathan26.concepts.proplems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1);
        Collections.sort(list, (num1, num2) -> num2 - num1);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
