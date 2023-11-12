package com.github.mathan26.concepts.stringsexamples;

public class Main {
    public static void main(String[] args) {

        System.out.println(isStringOnlyAlphabet("abcdef"));
        System.out.println(isStringOnlyAlphabetASCII("1Aabcdef"));

    }

    public static boolean isStringOnlyAlphabetASCII(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((!(ch >= 'A' && ch <= 'Z'))
                    && (!(ch >= 'a' && ch <= 'z'))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isStringOnlyAlphabet(String s) {
        s.matches("");
        return (!s.equals("") && s != null && s.chars().allMatch(Character::isLetter));
    }
}
