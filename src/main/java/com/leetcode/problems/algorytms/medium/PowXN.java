package com.leetcode.problems.algorytms.medium;


/*
 * Original text: https://leetcode.com/problems/powx-n/#/description
 *
 * Implement pow(x, n).
 *
 * */

class PowXN {

    double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == Integer.MIN_VALUE) {
            return Math.abs(x) == 1 ? 1 : 0;
        } else if (Math.abs(x) == 1) {
            return x;
        } else if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        return ((n % 2 == 0) ? 1 : x) * myPow(x * x, n / 2);
    }
}
