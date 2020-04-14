package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void twoSum() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 3}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 22));
    }

}