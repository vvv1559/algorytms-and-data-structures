package com.leetcode.problems.algorytms.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTwoIntegersTest {
    private DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();

    @Test
    public void checkSimple() throws Exception {
        assertEquals(1, divideTwoIntegers.divide(2, 2));
        assertEquals(2, divideTwoIntegers.divide(4, 2));
        assertEquals(2, divideTwoIntegers.divide(5, 2));
        assertEquals(3, divideTwoIntegers.divide(6, 2));
        assertEquals(0, divideTwoIntegers.divide(2, 6));
        assertEquals(11, divideTwoIntegers.divide(121, 11));
    }

    @Test
    public void negatives() throws Exception {
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
    public void extremes() throws Exception {
        assertEquals(0, divideTwoIntegers.divide(0, 12));
        assertEquals(15, divideTwoIntegers.divide(15, 1));
        assertEquals(Integer.MAX_VALUE, divideTwoIntegers.divide(-2147483648, -1));
    }
}