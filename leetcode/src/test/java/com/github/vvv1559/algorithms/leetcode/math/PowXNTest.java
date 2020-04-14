package com.github.vvv1559.algorithms.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowXNTest {
    private PowXN powXN = new PowXN();

    private void compareWithMath(double val, int pow) {
        assertEquals(Math.pow(val, pow), powXN.myPow(val, pow), 0);
    }

    @Test
    public void simpleTest() {
        compareWithMath(2, 2);
        compareWithMath(2, 3);
    }

    @Test
    public void negatives() {
        compareWithMath(3, -2);
        compareWithMath(3, -3);
    }

    @Test
    public void extremes() {
        compareWithMath(2, 0);
        compareWithMath(5, 1);
        compareWithMath(2.00000, Integer.MIN_VALUE);
        compareWithMath(2.00000, Integer.MAX_VALUE);
        compareWithMath(-1.00000, Integer.MAX_VALUE);
        compareWithMath(1.00000, Integer.MIN_VALUE);
        compareWithMath(-1.00000, Integer.MIN_VALUE);
    }
}