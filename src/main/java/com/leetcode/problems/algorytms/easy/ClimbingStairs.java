package com.leetcode.problems.algorytms.easy;

import com.Difficulty;

import static com.Difficulty.Level.EASY;


@Difficulty(EASY)
class ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 0) return 0;
        int previous = 0;
        int next = 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = next + previous;
            previous = next;
            next = result;

        }

        return result;
    }
}
