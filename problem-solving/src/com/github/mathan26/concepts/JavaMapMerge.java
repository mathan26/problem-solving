package com.github.mathan26.concepts;

import java.util.HashMap;

public class JavaMapMerge {
    public static void main(String[] args) {
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("empId",747);
        map1.put("age",26);
        System.out.println(map1); //{empId=747, age=26}
        //posssible to modify the existing key
        map1.merge("empId",100,(v1,v2)->v1+v2);

        //possible to add new key Here v1 is equal to 0
        map1.merge("newkey",200,(v1,v2)->v1+v2);
        System.out.println(map1);//{empId=847, newkey=200, age=26}

        //since key already exist it add's the with existing value
        map1.merge("newkey",200,(v1,v2)->v1+v2);
        System.out.println(map1);//{empId=847, newkey=400, age=26}
    }
}
