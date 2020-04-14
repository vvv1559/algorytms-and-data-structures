package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3SumTest {
    private final _3Sum sum = new _3Sum();

    @Test
    public void example() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );

        assertEquals(expected, sum.threeSum(nums));
    }
}