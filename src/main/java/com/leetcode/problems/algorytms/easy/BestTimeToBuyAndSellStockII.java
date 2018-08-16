package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.SolutionComplexity;

import static com.Difficulty.Level.EASY;

@Difficulty(EASY)
class BestTimeToBuyAndSellStockII {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(1)")
    int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int min = prices[0];
        int max = prices[0];
        int result = 0;

        int lastIndex = prices.length - 1;
        for (int i = 1; i < prices.length; i++) {
            int val = prices[i];

            if (val >= max) {
                max = val;
                if (i == lastIndex) result += max - min;
            } else {
                result += max - min;
                max = val;
                min = val;
            }

        }
        return result;
    }
}