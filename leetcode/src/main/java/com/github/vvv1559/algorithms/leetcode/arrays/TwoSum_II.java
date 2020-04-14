package com.github.vvv1559.algorithms.leetcode.arrays;

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.EASY)
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
