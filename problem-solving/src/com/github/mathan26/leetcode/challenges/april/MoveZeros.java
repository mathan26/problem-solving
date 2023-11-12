package com.github.mathan26.leetcode.challenges.april;

import java.util.Arrays;


/*
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
 */

public class MoveZeros {
    public void moveZeroes(int[] nums) {

        if (nums.length == 0 || nums.length == 1)
            return;
        int left = 0, right = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                right++;
            } else {
                int temp = nums[i];
                nums[right] = nums[left];
                nums[left] = temp;
                right++;
                left++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

