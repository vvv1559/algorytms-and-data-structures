package com.github.vvv1559.algorithms.leetcode.math;

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

/*
 * Original text: https://leetcode.com/problems/sqrtx/description/
 *
 * Implement int sqrt(int x).
 *
 * Compute and return the square root of x.
 * */

@Difficulty(Level.EASY)
class Sqrt {

    int mySqrt(int x) {
        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
        }

        return (int) r;
    }
}
