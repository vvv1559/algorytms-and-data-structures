package com.leetcode.problems.algorytms.easy;

import com.common.RomanNumber;
import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {
    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    public void testSimpleValues() throws Exception {
        for (RomanNumber number : RomanNumber.values()) {
            Assert.assertEquals(number.getIntValue(), romanToInteger.romanToInt(number.name()));
        }
    }

    @Test
    public void testValues() throws Exception {
        Assert.assertEquals(1, romanToInteger.romanToInt("I"));
        Assert.assertEquals(101, romanToInteger.romanToInt("CI"));
        Assert.assertEquals(163, romanToInteger.romanToInt("CLXIII"));
        Assert.assertEquals(4, romanToInteger.romanToInt("IV"));
        Assert.assertEquals(9, romanToInteger.romanToInt("IX"));
        Assert.assertEquals(19, romanToInteger.romanToInt("XIX"));
        Assert.assertEquals(99, romanToInteger.romanToInt("XCIX"));
    }
}
