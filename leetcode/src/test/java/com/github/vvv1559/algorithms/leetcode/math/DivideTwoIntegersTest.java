package com.github.vvv1559.algorithms.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTwoIntegersTest {
    private final DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();

    @Test
    public void checkSimple() {
        assertEquals(1, divideTwoIntegers.divide(2, 2));
        assertEquals(2, divideTwoIntegers.divide(4, 2));
        assertEquals(2, divideTwoIntegers.divide(5, 2));
        assertEquals(3, divideTwoIntegers.divide(6, 2));
        assertEquals(0, divideTwoIntegers.divide(2, 6));
        assertEquals(11, divideTwoIntegers.divide(121, 11));
    }

    @Test
    public void negatives() {
        assertEquals(-2, divideTwoIntegers.divide(-4, 2));
        assertEquals(-1, divideTwoIntegers.divide(-1, 1));
        assertEquals(-1, divideTwoIntegers.divide(-2, 2));
        assertEquals(-1, divideTwoIntegers.divide(2, -2));
        assertEquals(-1073741824, divideTwoIntegers.divide(-2147483648, 2));
        assertEquals(1, divideTwoIntegers.divide(-2147483648, -2147483648));
        assertEquals(-1, divideTwoIntegers.divide(1, -1));
        assertEquals(-2, divideTwoIntegers.divide(4, -2));
        assertEquals(2, divideTwoIntegers.divide(-4, -2));
    }

    @Test
    public void extremes() {
        assertEquals(0, divideTwoIntegers.divide(0, 12));
        assertEquals(15, divideTwoIntegers.divide(15, 1));
        assertEquals(Integer.MAX_VALUE, divideTwoIntegers.divide(-2147483648, -1));
    }
}