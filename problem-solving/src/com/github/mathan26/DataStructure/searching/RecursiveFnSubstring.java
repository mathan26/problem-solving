package com.github.mathan26.DataStructure.searching;

public class RecursiveFnSubstring {
    public static void main(String[] args) {
        System.out.println(contains("geeksforgeeks", "for"));
    }

    private static boolean contains(String text, String pat) {
        if (text == null || pat == null)
            return false;
        if (pat.length() > text.length()) {
            return false;
        }
        if (text.length() == pat.length()) {
            return text.equals(pat);
        }

        return text.startsWith(pat) || contains(text.substring(1), pat);
    }
}
