package com.leetcode.problems.algorytms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtTest {
    @Test
    public void example() throws Exception {
        Sqrt sqrt = new Sqrt();
        assertEquals((int) Math.sqrt(4), sqrt.mySqrt(4));
        assertEquals((int) Math.sqrt(5), sqrt.mySqrt(5));
        assertEquals((int) Math.sqrt(16), sqrt.mySqrt(16));
    }
}