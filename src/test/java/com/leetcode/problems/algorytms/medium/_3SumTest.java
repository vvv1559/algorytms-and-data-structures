package com.leetcode.problems.algorytms.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class _3SumTest {
    private _3Sum sum = new _3Sum();

    @Test
    public void example() throws Exception {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );

        Assert.assertEquals(expected, sum.threeSum(nums));
    }
}