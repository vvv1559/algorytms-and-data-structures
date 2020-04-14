package com.github.vvv1559.algorithms.leetcode.arrays;


/*
 * Original text: https://leetcode.com/problems/median-of-two-sorted-arrays/#/description
 *
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 *
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.HARD)
class MedianOfTwoSortedArrays {

    double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final int fullLength = nums1.length + nums2.length;
        final int secondIndex = fullLength / 2;
        final int firstIndex = (fullLength % 2 == 0 && secondIndex != 0) ? secondIndex - 1 : secondIndex;

        int firstVal = 0;
        int secondVal = 0;
        int nextNums1Index = 0;
        int nextNums2Index = 0;

        for (int i = 0; i <= secondIndex; i++) {
            final int val;
            if (nextNums1Index == nums1.length) {
                val = nums2[nextNums2Index++];
            } else if (nextNums2Index == nums2.length) {
                val = nums1[nextNums1Index++];
            } else {
                final int num1Val = nums1[nextNums1Index];
                final int num2Val = nums2[nextNums2Index];

                if (num1Val <= num2Val) {
                    val = num1Val;
                    nextNums1Index++;
                } else {
                    val = num2Val;
                    nextNums2Index++;
                }
            }

            if (i == firstIndex) {
                firstVal = val;
            }

            if (i == secondIndex) {
                secondVal = val;
            }
        }

        return (secondVal + firstVal) / 2.0;
    }
}
