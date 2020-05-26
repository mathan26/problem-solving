package com.github.mathan26.concepts;

import java.util.*;

public class DataFormation {
    public static void main(String[] args) {
        int detailRecordCount=0;
        int rankRangeLength=0;
        ArrayList<Map<String,String>> detailList = new ArrayList<Map<String, String>>();
        ArrayList<Map<String,String>> rankList = new ArrayList<Map<String, String>>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the detail Record (e.g ) 4) Count and Rank Range (e.g )10)");
        detailRecordCount=input.nextInt();
        rankRangeLength=input.nextInt();
        int totalRankRecordInsert=detailRecordCount *rankRangeLength;

        //totalRankGuideline insert

        System.out.println(totalRankRecordInsert);

        //Make detail Record data
        Map<String,String> detailMap= null;
        System.out.println("---detailRecord data---");
        for (int i=0;i<detailRecordCount;i++){
            detailMap=new HashMap<>();
            detailMap.put(""+i,""+i);
            detailMap.put("autono", UUID.randomUUID().toString());
            System.out.println(detailMap);
            detailList.add(detailMap);
        }

        //make rankGuideLine Data
        Map<String,String> rankDataMap= null;
        System.out.println("---rankRecord data---");
        for (int i=0;i<totalRankRecordInsert;i++){
            rankDataMap=new HashMap<>();
            rankDataMap.put(""+i,""+i);
//            System.out.println(rankDataMap);
            rankList.add(rankDataMap);
        }

        int intialCount=totalRankRecordInsert/detailRecordCount;
        int checkCount=intialCount;
        int index=0;
        for (int i=0;i<rankList.size();i++){
            if(i > checkCount -1){
                checkCount +=intialCount;
                index++;
            }
            rankList.get(i).putIfAbsent("autono",detailList.get(index).get("autono"));

        }

        //new RankRecord
        System.out.println("\n---UPDATED rankRecord data---");
      rankList.stream().forEach(stringStringMap -> System.out.println(stringStringMap));
      //  rankList.stream().forEach(map->(map).forEach((k,v)-> System.out.println(("key "+k+" value"+v))));
    }
}
