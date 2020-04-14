package com.leetcode.problems.algorytms.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/*
 * Original text: https://leetcode.com/problems/3sum/#/description
 *
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets
 * in the array which gives the sum of zero.
 *
 * Note: The solution set must not contain duplicate triplets.
 *
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 * */

class _3Sum {

    List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int sndValIndex = i + 1;
                int trdValIndex = nums.length - 1;
                int sum = 0 - nums[i];

                while (sndValIndex < trdValIndex) {
                    int numbersSum = nums[sndValIndex] + nums[trdValIndex];

                    if (numbersSum < sum) sndValIndex++;
                    else if (numbersSum > sum) trdValIndex--;
                    else {
                        result.add(Arrays.asList(nums[i], nums[sndValIndex], nums[trdValIndex]));

                        //skip duplicates
                        while (sndValIndex < trdValIndex && nums[sndValIndex] == nums[++sndValIndex]) {
                        }
                        while (sndValIndex < trdValIndex && nums[trdValIndex] == nums[--trdValIndex]) {
                        }

                    }
                }
            }
        }
        return result;
    }
}
