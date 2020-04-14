package com.leetcode.problems.algorytms.easy;


/*
 * Original text: https://leetcode.com/problems/reverse-integer/#/description
 *
 * Reverse digits of an integer.
 *
 * Note:
 *
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 * */

class ReverseInteger {

    int reverse(int x) {
        int result = 0;
        while (x != 0) {
            final int newX = x / 10;
            final int newResult = x10(result - newX) + x;

            if (newResult / 10 != result) {
                return 0;
            }

            result = newResult;
            x = newX;
        }

        return result;
    }

    private int x10(int val) {
        return (val << 3) + (val << 1);
    }
}
