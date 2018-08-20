package com.leetcode.problems.algorytms.easy;

import com.Difficulty;

import static com.Difficulty.Level.EASY;


@Difficulty(EASY)
class TwoSum_II {

    int[] twoSum(int[] numbers, int target) {
        int fstIndex = 1, sndIndex = numbers.length, sum;
        while ((sum = numbers[fstIndex - 1] + numbers[sndIndex - 1]) != target) {
            if (sum < target) fstIndex++;
            else sndIndex--;
        }
        return new int[]{fstIndex, sndIndex};
    }
}
