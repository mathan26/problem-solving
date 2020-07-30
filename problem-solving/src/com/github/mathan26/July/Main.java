package com.github.mathan26.July;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr={0,-2,-2,5,5,5};
        int n=distinctList(arr);
        System.out.println(n);

        //System.out.println("baseball".indexOf("base"));
        wordSplit(new String[]{"baseball","a,all,b,ball,bas,base,cat,code,d,e,quit,z"});
        wordSplit(new String[]{"abcgefd","a,ab,abcg,b,c,dog,e,efd,zzzz"});
    }

    private static void wordSplit(String[] strings) {
        String word = strings[0];
        StringJoiner result = new StringJoiner(",");

        String[] seq=strings[1].split(",");
        List<String> matchedWord = new ArrayList<>();
        for(int i=0;i<seq.length;i++){
            if(word.indexOf(seq[i])==0){
                matchedWord.add(seq[i]);
            }
        }

        for (int i=0;i<seq.length;i++){
            for(int k=0;k<matchedWord.size();k++){
                if(word.equals(matchedWord.get(k)+seq[i])){
                    result.add(matchedWord.get(k));
                    result.add(seq[i]);
                    break;
                }

            }
        }

        if(result.length()>0){
            System.out.println(result.toString());
        }else{
            System.out.println("not possible");
        }
    }

    private static int distinctList(int... arr) {
        HashSet<Integer> set = new HashSet<>();


        for(int i=0;i<arr.length;i++){
            if (!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }


        return arr.length - set.size();
    }
}
