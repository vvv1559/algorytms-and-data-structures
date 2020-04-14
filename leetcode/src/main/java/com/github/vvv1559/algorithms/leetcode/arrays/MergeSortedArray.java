package com.github.vvv1559.algorithms.leetcode.arrays;


/*
 * Original text: https://leetcode.com/problems/merge-sorted-array/description/
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 *
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements
 * from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.EASY)
class MergeSortedArray {

    void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 0 || nums2.length == 0) {
            return;
        }

        int insertPos = m + n - 1;
        while (insertPos >= 0) {
            int fst = m > 0 ? nums1[m - 1] : Integer.MIN_VALUE;
            int snd = n > 0 ? nums2[n - 1] : Integer.MIN_VALUE;
            if (fst > snd) {
                nums1[insertPos] = fst;
                m--;
            } else {
                nums1[insertPos] = snd;
                n--;
            }
            insertPos--;
        }
    }
}
