package com.github.mathan26.concepts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String[] args) {
        /*
        * Pattern	Description
            [abc]	Matches a, b, or c
            [^abc]	Matches any character except a, b, or c
            [a-z]	Matches any lowercase letter
            [A-Z]	Matches any uppercase letter
            [0-9]	Matches any digit
            [a-zA-Z0-9]	Matches any letter or digit
        * */
        String pattern = "[abc]";
        String text = "abc1234";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if(m.find()) {
            System.out.println(m.group());
        }
        m.reset();

        String regex = "[0-9]";
        Pattern p2 = Pattern.compile(regex);
        m = p2.matcher(text);
        if(m.find()) {
            System.out.println(m.group());
        }


    }
}

/*
*  ✅ Concepts Learned:

    Pattern.compile(String) compiles the regex.

    Matcher is used to find matches in a string.

    find() scans for the next match.

    group() returns the matched string.


* */
