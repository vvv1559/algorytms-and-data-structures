package com.github.vvv1559.algorithms.leetcode.math.bits;

/*
 * Sum of Two Integers
 *
 * Original text: https://leetcode.com/problems/sum-of-two-integers/
 *
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *
 * Example 1:
 *
 * Input: a = 1, b = 2
 * Output: 3
 *
 *
 * Example 2:
 *
 * Input: a = -2, b = 3
 * Output: 1
 *
 *
 *
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.EASY)
class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        System.out.println("START");

        while (b != 0) {
            int sum = a ^ b;
            int carrier = a & b;
            a = sum;
            b = carrier << 1;
        }
        return a;
    }
}