package com.github.vvv1559.algorithms.leetcode.arrays;


/*
 * Original text: https://leetcode.com/problems/remove-element/#/description
 *
 * Given an array and a value, remove all instances of that value in place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 *
 * Your function should return length = 2, with the first two elements of nums being 2.
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.EASY)
class RemoveElement {

    int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }

        int newSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newSize++] = nums[i];
            }
        }

        return newSize;
    }
}
