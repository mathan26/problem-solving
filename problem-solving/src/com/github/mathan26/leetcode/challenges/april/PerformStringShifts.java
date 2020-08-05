package com.github.mathan26.leetcode.challenges.april;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.List;

public class PerformStringShifts {
    public static String stringShifts(String s, int[][] shifts){
        int val=0,rotateCount=0;
        String result="";
        for(int i=0;i<shifts.length;i++){
            val += shifts[i][0]==0 ? -shifts[i][1]:shifts[i][1];
        }

        int length = s.length();
        val = val % length;
        System.out.println(val);
        if(val >0){
            result=s.substring(length-val,length)+s.substring(0,length-val);
        }else {
            val=Math.abs(val);
            result=s.substring(val,length)+s.substring(0,val);
        }

        return result;
    }


    public static void main(String[] args) {

        int[][] shifts={{0,3},{1,10},{0,50},{1,70}};
        String s="abcdefg";
        System.out.println(stringShifts(s,shifts));

        int length=s.length();
        //Right rotation
        //System.out.println(s.substring(length-6,length)+s.substring(0,length-6));

        //left rotation
        //System.out.println(s.substring(6,length)+s.substring(0,6));


    }
}
