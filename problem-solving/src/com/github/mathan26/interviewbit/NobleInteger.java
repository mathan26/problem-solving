package com.github.mathan26.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NobleInteger {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,2,3));
        solve(list);
    }

    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);

        if(A.get(A.size()-1)==0) return 1;
        for(int i=0;i<A.size();i++){
            if(A.get(i)==(A.size()-i-1) && A.get(i)!=A.get(i+1)) return 1;
        }
        return -1;
    }
}
