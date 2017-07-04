package com.leetcode.problems.algorytms.easy;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {
    private final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void testExamples() {
        Assert.assertEquals(321, reverseInteger.reverse(123));
        Assert.assertEquals(-321, reverseInteger.reverse(-123));
        Assert.assertEquals(-1, reverseInteger.reverse(-10));
        Assert.assertEquals(-101, reverseInteger.reverse(-101));
    }


    @Test
    public void testNotes() {
        Assert.assertEquals(1, reverseInteger.reverse(10));
        Assert.assertEquals(1, reverseInteger.reverse(100));
        Assert.assertEquals(-1, reverseInteger.reverse(-100));
    }

    @Test
    public void testOverflow() {
        Assert.assertEquals(0, reverseInteger.reverse(1000000003));
        Assert.assertEquals(0, reverseInteger.reverse(-1000000003));
        Assert.assertEquals(0, reverseInteger.reverse(1534236469));
        Assert.assertEquals(0, reverseInteger.reverse(0));
    }
}