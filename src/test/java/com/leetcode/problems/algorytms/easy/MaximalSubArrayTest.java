package com.leetcode.problems.algorytms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximalSubArrayTest {
    private MaximalSubArray maximalSubArray = new MaximalSubArray();

    @Test
    public void examples() throws Exception {
        assertEquals(6, maximalSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, maximalSubArray.maxSubArray(new int[]{-2, 1}));
    }

    @Test
    public void extremes() throws Exception {
        assertEquals(1, maximalSubArray.maxSubArray(new int[]{1}));
        assertEquals(0, maximalSubArray.maxSubArray(new int[]{0}));
        assertEquals(1, maximalSubArray.maxSubArray(new int[]{1, -1, 1, -1}));
        assertEquals(-1, maximalSubArray.maxSubArray(new int[]{-1, -1, -1, -1}));
        assertEquals(-1, maximalSubArray.maxSubArray(new int[]{-2, -1, -1, -1}));
    }
}