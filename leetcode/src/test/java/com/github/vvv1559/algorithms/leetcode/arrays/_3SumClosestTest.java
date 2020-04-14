package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3SumClosestTest {
    private final _3SumClosest sumClosest = new _3SumClosest();

    @Test
    public void examples() {
        assertEquals(2, sumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        assertEquals(-2, sumClosest.threeSumClosest(new int[]{-3, -2, -5, 3, -4}, -1));
    }
}