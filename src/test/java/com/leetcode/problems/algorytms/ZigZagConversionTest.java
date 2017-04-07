package com.leetcode.problems.algorytms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {
    private final ZigZagConversion zigZagConversion = new ZigZagConversion();


    /*
    * P   A   H   N
    * A P L S I I G
    * Y   I   R
    * */
    @Test
    public void fromSample() throws Exception {
        Assert.assertEquals("PAHNAPLSIIGYIR", zigZagConversion.convert("PAYPALISHIRING", 3));
    }


    /*
    * P     I     N
    * A   L S   I G
    * Y A   H R
    * P     I
    * */
    @Test
    public void inFourLines() throws Exception {
        Assert.assertEquals("PINALSIGYAHRPI", zigZagConversion.convert("PAYPALISHIRING", 4));
    }

    @Test
    public void equals() throws Exception {
        Assert.assertEquals("PINALSIGYAHRPI", zigZagConversion.convert("PINALSIGYAHRPI", 1));
        Assert.assertEquals("PINALSIGYAHRPI", zigZagConversion.convert("PINALSIGYAHRPI", 14));
    }

    @Test
    public void justOne() throws Exception {
        Assert.assertEquals("P", zigZagConversion.convert("P", 15));
        Assert.assertEquals("", zigZagConversion.convert("", 14));
    }
}