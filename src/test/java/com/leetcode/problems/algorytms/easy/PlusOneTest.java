package com.leetcode.problems.algorytms.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {
    private PlusOne plusOne = new PlusOne();

    @Test
    public void example() throws Exception {
        assertArrayEquals(new int[]{5}, plusOne.plusOne(new int[]{4}));
        assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1, 0, 0}, plusOne.plusOne(new int[]{9, 9}));
    }

    @Test
    public void extremes() throws Exception {
        assertArrayEquals(new int[]{1}, plusOne.plusOne(new int[]{0}));
    }
}