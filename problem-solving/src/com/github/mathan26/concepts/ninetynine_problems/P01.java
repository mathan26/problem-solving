package com.github.mathan26.concepts.ninetynine_problems;

import java.util.List;

/**
 * (*) Find the last element of a list.
 * <p>
 * Check P01Test class for test cases related to this problem.
 */
public class P01 {
    public static <T> T last(List<T> elements){
        int numberOfElements = elements.size();
        return elements.get(numberOfElements -1);
    }
}
