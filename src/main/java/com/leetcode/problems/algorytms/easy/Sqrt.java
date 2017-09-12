package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.SolutionComplexity;

import static com.Difficulty.Level.EASY;

/*
* Original text: https://leetcode.com/problems/sqrtx/description/
*
* Implement int sqrt(int x).
*
* Compute and return the square root of x.
* */

@Difficulty(EASY)
class Sqrt {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(1)")
    int mySqrt(int x) {
        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
        }

        return (int) r;
    }
}
