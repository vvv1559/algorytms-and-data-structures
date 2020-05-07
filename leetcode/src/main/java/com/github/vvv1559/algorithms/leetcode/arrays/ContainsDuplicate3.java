package com.github.vvv1559.algorithms.leetcode.arrays;

/*
 * Contains Duplicate III
 *
 * Original text: https://leetcode.com/problems/contains-duplicate-iii/
 *
 * Given an array of integers, find out whether there are two distinct indices i and j in the array such that the
 * absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3, t = 0
 * Output: true
 *
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1, t = 2
 * Output: true
 *
 * Example 3:
 *
 * Input: nums = [1,5,9,1,5,9], k = 2, t = 3
 * Output: false
 *
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

import java.util.TreeSet;

@Difficulty(Level.MEDIUM)
class ContainsDuplicate3 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            long num = nums[i];
            Long floor = set.floor(num);
            if (floor != null && num - floor <= t) {
                return true;
            }
            Long ceiling = set.ceiling(num);
            if (ceiling != null && ceiling - num <= t) {
                return true;
            }

            set.add(num);
            if (set.size() > k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }

}