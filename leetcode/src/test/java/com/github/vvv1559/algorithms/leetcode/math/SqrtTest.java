package com.github.vvv1559.algorithms.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtTest {
    @Test
    public void example() {
        Sqrt sqrt = new Sqrt();
        assertEquals((int) Math.sqrt(4), sqrt.mySqrt(4));
        assertEquals((int) Math.sqrt(5), sqrt.mySqrt(5));
        assertEquals((int) Math.sqrt(16), sqrt.mySqrt(16));
    }
}