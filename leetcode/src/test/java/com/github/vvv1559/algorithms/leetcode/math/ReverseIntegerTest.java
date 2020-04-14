package com.github.vvv1559.algorithms.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {
    private final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void testExamples() {
        assertEquals(321, reverseInteger.reverse(123));
        assertEquals(-321, reverseInteger.reverse(-123));
        assertEquals(-1, reverseInteger.reverse(-10));
        assertEquals(-101, reverseInteger.reverse(-101));
    }


    @Test
    public void testNotes() {
        assertEquals(1, reverseInteger.reverse(10));
        assertEquals(1, reverseInteger.reverse(100));
        assertEquals(-1, reverseInteger.reverse(-100));
    }

    @Test
    public void testOverflow() {
        assertEquals(0, reverseInteger.reverse(1000000003));
        assertEquals(0, reverseInteger.reverse(-1000000003));
        assertEquals(0, reverseInteger.reverse(1534236469));
        assertEquals(0, reverseInteger.reverse(0));
    }
}