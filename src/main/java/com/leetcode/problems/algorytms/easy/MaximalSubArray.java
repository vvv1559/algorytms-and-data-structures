package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.SolutionComplexity;

import static com.Difficulty.Level.EASY;

/*
* Original text: https://leetcode.com/problems/maximum-subarray/tabs/description
*
* Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
*
* For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
*
* the contiguous subarray [4,-1,2,1] has the largest sum = 6.
* */

@Difficulty(EASY)
class MaximalSubArray {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(1)")
    int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int positiveSum = 0;
        for (int num : nums) {
            int sum = positiveSum + num;
            maxSum = Math.max(maxSum, sum);
            positiveSum = Math.max(0, sum);
        }
        return maxSum;
    }
}
