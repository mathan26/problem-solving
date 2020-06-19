package com.github.mathan26.concepts.basics;

import java.util.HashMap;

public class OverWriteHashcodeAndEquals {
    public static void main(String[] args) {
        HashMap<Object,Integer> map = new HashMap<>();
        map.put(new Key("A"),1);
        map.put(new Key("B"),2);
        map.put(new Key("A"),3);

        System.out.println(map.get(new Key("A")));
    }
}

//Output

//Hashcode for the key 66
//Hashcode for the key 65
//Hashcode for the key 65
//3