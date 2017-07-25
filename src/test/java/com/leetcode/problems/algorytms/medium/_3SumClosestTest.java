package com.leetcode.problems.algorytms.medium;

import org.junit.Assert;
import org.junit.Test;

public class _3SumClosestTest {
    private _3SumClosest sumClosest = new _3SumClosest();

    @Test
    public void examples() throws Exception {
        Assert.assertEquals(2, sumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        Assert.assertEquals(-2, sumClosest.threeSumClosest(new int[]{-3, -2, -5, 3, -4}, -1));
    }
}