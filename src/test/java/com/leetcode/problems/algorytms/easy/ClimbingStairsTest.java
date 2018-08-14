package com.leetcode.problems.algorytms.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {

    @Test
    public void climbStairs() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(0, climbingStairs.climbStairs(0));
        assertEquals(1, climbingStairs.climbStairs(1));
        assertEquals(2, climbingStairs.climbStairs(2));
        assertEquals(3, climbingStairs.climbStairs(3));
        assertEquals(5, climbingStairs.climbStairs(4));
        assertEquals(8, climbingStairs.climbStairs(5));
        assertEquals(13, climbingStairs.climbStairs(6));
    }
}