package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.SolutionComplexity;

import static com.Difficulty.Level.EASY;

/*
* Original text: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
*
* Say you have an array for which the ith element is the price of a given stock on day i.
*
* If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
* design an algorithm to find the maximum profit.
* */

@Difficulty(EASY)
class BestTimeToBuyAndSellStock {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(1)")
    int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxCur += prices[i] - prices[i - 1];
            maxCur = Math.max(0, maxCur);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}
