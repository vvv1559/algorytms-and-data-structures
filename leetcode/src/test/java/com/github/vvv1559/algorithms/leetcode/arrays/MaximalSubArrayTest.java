package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximalSubArrayTest {
    private final MaximalSubArray maximalSubArray = new MaximalSubArray();

    @Test
    public void examples() {
        assertEquals(6, maximalSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, maximalSubArray.maxSubArray(new int[]{-2, 1}));
    }

    @Test
    public void extremes() {
        assertEquals(1, maximalSubArray.maxSubArray(new int[]{1}));
        assertEquals(0, maximalSubArray.maxSubArray(new int[]{0}));
        assertEquals(1, maximalSubArray.maxSubArray(new int[]{1, -1, 1, -1}));
        assertEquals(-1, maximalSubArray.maxSubArray(new int[]{-1, -1, -1, -1}));
        assertEquals(-1, maximalSubArray.maxSubArray(new int[]{-2, -1, -1, -1}));
    }
}