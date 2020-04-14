package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigZagConversionTest {
    private final ZigZagConversion zigZagConversion = new ZigZagConversion();


    /*
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * */
    @Test
    public void fromSample() {
        assertEquals("PAHNAPLSIIGYIR", zigZagConversion.convert("PAYPALISHIRING", 3));
    }


    /*
     * P     I     N
     * A   L S   I G
     * Y A   H R
     * P     I
     * */
    @Test
    public void inFourLines() {
        assertEquals("PINALSIGYAHRPI", zigZagConversion.convert("PAYPALISHIRING", 4));
    }

    @Test
    public void equals() {
        assertEquals("PINALSIGYAHRPI", zigZagConversion.convert("PINALSIGYAHRPI", 1));
        assertEquals("PINALSIGYAHRPI", zigZagConversion.convert("PINALSIGYAHRPI", 14));
    }

    @Test
    public void justOne() {
        assertEquals("P", zigZagConversion.convert("P", 15));
        assertEquals("", zigZagConversion.convert("", 14));
    }
}