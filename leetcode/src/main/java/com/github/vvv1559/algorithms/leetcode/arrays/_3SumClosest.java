package com.github.vvv1559.algorithms.leetcode.arrays;

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

import java.util.Arrays;


/*
 * Original text: https://leetcode.com/problems/3sum-closest/#/description
 *
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 * */

@Difficulty(Level.MEDIUM)
class _3SumClosest {

    int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[2];
        int n = nums.length - 2;

        if (n == 1 || result == target) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            int start = i + 1;
            int end = n + 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                if (Math.abs(sum - target) <= Math.abs(result - target)) {
                    if (sum == target) return sum;

                    result = sum;
                }

                if (sum < target) start++;
                else end--;
            }

        }
        return result;
    }
}
