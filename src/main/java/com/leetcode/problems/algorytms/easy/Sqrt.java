package com.leetcode.problems.algorytms.easy;


/*
 * Original text: https://leetcode.com/problems/sqrtx/description/
 *
 * Implement int sqrt(int x).
 *
 * Compute and return the square root of x.
 * */

class Sqrt {

    int mySqrt(int x) {
        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
        }

        return (int) r;
    }
}
