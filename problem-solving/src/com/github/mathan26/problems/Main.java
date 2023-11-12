package com.github.mathan26.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//      System.out.println(1+2==+3+++5);
        System.out.println((byte) 260);
        List<? extends Number> n = new ArrayList<>();
        n.add(null);
        foo(null);
        System.out.println(1 * 2 + 3 ^ 4 / 5);
        System.out.println("DEF" + 20 * 10);
        int[] nums = {3, 6, 8};
        System.out.println(getMaxScore(nums));

        List<String> list = Arrays.asList("aab", "aacccd", "sdfdsf");
        List<String> aa = list.stream().filter(s -> {
            return s.startsWith("aa");
        }).map(s -> {
            long count = s.chars().distinct().count();
            return s = "\"" + s + "\" - " + String.valueOf(count);
        }).collect(Collectors.toList());
        System.out.println(aa);
    }

    private static void foo(Object o) {
        System.out.println("obj *************");
    }

    private static void foo(String o) {
        System.out.println("string");
    }

    private static int getMaxScore(int[] nums) {
        int[] preSum = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
        boolean isOdd = nums.length % 2 == 1;
        int[][] dp = new int[nums.length][nums.length];
        for (int l = 0; l < nums.length; l++) {
            for (int i = 0; i + l < nums.length; i++) {
                if (l == 0) {
                    dp[i][i] = isOdd ? nums[i] : -nums[i];
                    continue;
                } else {
                    if (isOdd) {
                        dp[i][i + l] = Math.max(dp[i + 1][i + l], dp[i][i + l - 1]) + preSum[i + l + 1] - preSum[i];
                    } else {
                        dp[i][i + l] = Math.max(dp[i + 1][i + l], dp[i][i + l - 1]) - preSum[i + l + 1] + preSum[i];
                    }
                }
            }
            isOdd = !isOdd;
        }
        return dp[0][nums.length - 1];
    }
}
