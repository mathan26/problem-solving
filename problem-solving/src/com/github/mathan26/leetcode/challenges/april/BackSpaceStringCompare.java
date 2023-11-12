package com.github.mathan26.leetcode.challenges.april;

public class BackSpaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();

        for (char c : S.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result1.append(String.valueOf(c)); //String.valueOf(c)  convert char to String
            } else if (String.valueOf(c).equals("#") && result1.length() > 0) {
                result1.deleteCharAt(result1.length() - 1);
            }
        }
        System.out.println(result1);
        for (char c : T.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result2.append(String.valueOf(c));
            } else if (String.valueOf(c).equals("#") && result2.length() > 0) {
                result2.deleteCharAt(result2.length() - 1);
            }
        }
        System.out.println(result2);


        boolean equals = result1.toString().equals(result2.toString()); //toString() before equals
        System.out.println(equals);
        return equals;

    }
}
