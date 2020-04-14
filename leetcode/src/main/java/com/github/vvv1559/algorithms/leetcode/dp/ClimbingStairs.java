package com.github.vvv1559.algorithms.leetcode.dp;

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.EASY)
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
