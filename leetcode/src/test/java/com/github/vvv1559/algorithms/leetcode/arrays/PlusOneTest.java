package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class PlusOneTest {
    private PlusOne plusOne = new PlusOne();

    @Test
    public void example() {
        assertArrayEquals(new int[]{5}, plusOne.plusOne(new int[]{4}));
        assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1, 0, 0}, plusOne.plusOne(new int[]{9, 9}));
    }

    @Test
    public void extremes() {
        assertArrayEquals(new int[]{1}, plusOne.plusOne(new int[]{0}));
    }
}