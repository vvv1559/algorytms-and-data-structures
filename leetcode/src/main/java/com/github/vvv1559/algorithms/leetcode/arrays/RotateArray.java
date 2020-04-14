package com.github.vvv1559.algorithms.leetcode.arrays;

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.EASY)
class RotateArray {

    void rotate(int[] nums, int k) {
        if (nums == null) return;
        int arrLength = nums.length;
        if (arrLength < 2) return;
        k %= arrLength;
        if (k == 0) return;
        reverse(nums, 0, arrLength - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, arrLength - 1);
    }

    private void reverse(int[] nums, int firstIndex, int lastIndex) {
        while (firstIndex < lastIndex) {
            int tmp = nums[firstIndex];
            nums[firstIndex] = nums[lastIndex];
            nums[lastIndex] = tmp;
            firstIndex++;
            lastIndex--;
        }
    }
}
