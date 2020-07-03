package com.github.mathan26.July.leetcode;

import java.util.Collections;
import java.util.HashSet;

public class JewelsAndStones {
    public static void main(String[] args) {
        String J="aA";
        String S="aAAbbbb";
        int count=0;
        HashSet<Character> hashSet= new HashSet<>();
        for(int i=0;i<J.length();i++){
            hashSet.add(J.charAt(i));
        }

        for(int i=0;i<S.length();i++){
            if(hashSet.contains(S.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
