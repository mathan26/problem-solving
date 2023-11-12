package com.github.mathan26.leetcode.challenges.april;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountElements {

    public static void main(String[] args) {
        int result = countElements(Arrays.asList(1, 2, 1, 3));
        System.out.println(result);
    }

    public static int countElements(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        int i;
        int n = list.size();
        for (int j = 0; j < n; j++) {
            if (!map.containsKey(list.get(j))) {
                map.put(list.get(j), 1);
            } else {
                map.put(list.get(j), map.get(list.get(j)) + 1);
            }
        }

        int count = 0;
        for (int k : map.keySet()) {
            if (map.containsKey(k + 1)) {
                count += map.get(k);
            }
        }
        return count;
    }
}
