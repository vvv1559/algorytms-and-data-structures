package com.github.vvv1559.algorithms.leetcode.arrays;


/*
 * Original text: https://leetcode.com/problems/search-for-a-range/description/
 *
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * For example,
 *
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class SearchForRange {

    int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int index = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                index = mid;
                break;
            }
        }

        if (index != -1) {
            start = index;
            end = index;
            while (start > 0 && nums[start - 1] == target) start--;
            while (end < nums.length - 1 && nums[end + 1] == target) end++;

            return new int[]{start, end};
        }

        return new int[]{-1, -1};
    }
}
