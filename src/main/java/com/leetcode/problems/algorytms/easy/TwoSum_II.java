package com.leetcode.problems.algorytms.easy;


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
