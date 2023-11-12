package com.github.mathan26.leetcode.challenges.april;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            //to reduce the sorting opeation
            char[] ca = new char[26];
            for (char c : str.toCharArray()) {
                ca[c - 'a']++;
            }
            String keyStr = String.valueOf(ca);

            if (!map.containsKey(keyStr))
                map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(str);
        }

        // Convert Map of List to List of List
        return new ArrayList<>(map.values());
    }
}
