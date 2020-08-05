package com.github.mathan26.leetcode.challenges.april;

import java.util.HashMap;
import java.util.Map;

public class ContigousArrayBinarynos {

        public int findMaxLength(int[] nums) {
            Map<Integer,Integer> map = new HashMap<>();
            int sum=0, longestSubArray=0;

            for(int i=0;i<nums.length;i++){
                sum  +=  nums[i]==0 ?-1:1;
                if(sum==0){  // sum =0 should be checked first
                    if(longestSubArray < i + 1)
                        longestSubArray = i + 1;
                }else if(map.containsKey(sum)){ // contains should be checked second
                    if(longestSubArray < i - map.get(sum))
                        longestSubArray =  i - map.get(sum);
                }else{
                    map.put(sum,i);         // finally add with the map if not present
                }

            }

            return longestSubArray;
        }
}
