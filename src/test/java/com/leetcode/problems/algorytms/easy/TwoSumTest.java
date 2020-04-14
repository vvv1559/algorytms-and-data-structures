package com.leetcode.problems.algorytms.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    @Test
    public void twoSum() throws Exception {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 3}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 22));
    }

}