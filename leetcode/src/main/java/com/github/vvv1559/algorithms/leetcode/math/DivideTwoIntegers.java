package com.github.vvv1559.algorithms.leetcode.math;


/*
 * Original text: https://leetcode.com/problems/divide-two-integers/#/description
 *
 * Divide two integers without using multiplication, division and mod operator.
 *
 * If it is overflow, return MAX_INT.
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class DivideTwoIntegers {

    int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        int result = 0;
        long abs_dividend = Math.abs((long) dividend);
        long abs_divisor = Math.abs((long) divisor);

        while (abs_dividend >= abs_divisor) {
            long subDivisor = abs_divisor;
            int subResult = 1;
            while ((subDivisor << 1) <= abs_dividend) {
                subDivisor <<= 1;
                subResult <<= 1;
            }
            abs_dividend -= subDivisor;
            result += subResult;
        }

        return isNegative ? -result : result;
    }
}
