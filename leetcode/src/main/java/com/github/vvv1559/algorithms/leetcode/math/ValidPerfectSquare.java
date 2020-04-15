package com.github.vvv1559.algorithms.leetcode.math;

/*
 * Valid Perfect Square
 *
 * Original text: https://leetcode.com/problems/valid-perfect-square/
 *
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 * Note: Do not use any built-in library function such as sqrt.
 *
 * Example 1:
 * Input: 16
 * Output: true
 *
 *
 * Example 2:
 * Input: 14
 * Output: false
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.EASY)
class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }

        if (num < 4) {
            return false;
        }

        int left = 1;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midPow = mid * mid;
            if (midPow == num) {
                return true;
            }
            if (mid * mid < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}