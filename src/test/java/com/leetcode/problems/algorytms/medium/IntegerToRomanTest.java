package com.leetcode.problems.algorytms.medium;

import com.common.RomanNumber;
import org.junit.Assert;
import org.junit.Test;

public class IntegerToRomanTest {
    private final IntegerToRoman integerToRoman = new IntegerToRoman();

    @Test
    public void testSimpleValues() throws Exception {
        for (RomanNumber number : RomanNumber.values()) {
            Assert.assertEquals(number.name(), integerToRoman.intToRoman(number.getIntValue()));
        }
    }

    @Test
    public void testValues() throws Exception {
        Assert.assertEquals("I", integerToRoman.intToRoman(1));
        Assert.assertEquals("CI", integerToRoman.intToRoman(101));
        Assert.assertEquals("CLXIII", integerToRoman.intToRoman(163));
        Assert.assertEquals("IV", integerToRoman.intToRoman(4));
        Assert.assertEquals("IX", integerToRoman.intToRoman(9));
        Assert.assertEquals("XIX", integerToRoman.intToRoman(19));
        Assert.assertEquals("XCIX", integerToRoman.intToRoman(99));
    }
}
