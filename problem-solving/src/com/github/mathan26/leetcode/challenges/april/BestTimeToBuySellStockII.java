package com.github.mathan26.leetcode.challenges.april;

/*
Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 */
public class BestTimeToBuySellStockII {
    class Solution {
        public int maxProfit(int[] prices) {
            int profit = 0;
            int size = prices.length;
            for (int i = 1; i < size; i++) {
                if (prices[i - 1] < prices[i]) {
                    profit += prices[i] - prices[i - 1];
                }
            }
            return profit;
        }
    }
}
