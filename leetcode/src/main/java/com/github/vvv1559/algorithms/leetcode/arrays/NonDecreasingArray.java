package com.github.vvv1559.algorithms.leetcode.arrays;

/*
 * Non-decreasing Array
 *
 * Original text: https://leetcode.com/problems/non-decreasing-array/
 *
 * Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most 1
 * element.
 * We define an array is non-decreasing if nums[i] &lt;= nums[i + 1] holds for every i(0-based) such that (0&lt;= i
 * &lt;= n - 2).
 *
 * Example 1:
 * Input: nums = [4,2,3]
 * Output: trueExplanation: You could modify the first 4 to 1 to get a non-decreasing array.
 *
 * Example 2:
 * Input: nums = [4,2,1]
 * Output: falseExplanation: You can&#39;t get a non-decreasing array by modify at most one element.
 *
 * Constraints:	1 &lt;= n &lt;= 10 ^ 4	- 10 ^ 5&lt;= nums[i] &lt;= 10 ^ 5
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.EASY)
class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int countOfDecreasing = 0;
        int prevNumber = nums[0];
        int lastIndex = nums.length - 1;

        for (int i = 1; i <= lastIndex; i++) {
            if (nums[i] < prevNumber) {
                countOfDecreasing++;
                if (i > 1 && (i < lastIndex && prevNumber > nums[i + 1]) && nums[i] < nums[i - 2]) {
                    return false;
                }
            }
            prevNumber = nums[i];
            if (countOfDecreasing > 1) {
                return false;
            }
        }
        return true;
    }
}