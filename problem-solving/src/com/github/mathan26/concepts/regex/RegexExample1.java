package com.github.mathan26.concepts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
    public static void main(String[] args) {
        String pattern = "cat";
        String text = "The cat is on the  roof.";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if(m.find()){
            System.out.println("match found: "+m.group());
        }else{
            System.out.println("No match found");
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
