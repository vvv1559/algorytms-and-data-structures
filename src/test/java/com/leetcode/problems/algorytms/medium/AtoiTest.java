package com.leetcode.problems.algorytms.medium;

import org.junit.Assert;
import org.junit.Test;

public class AtoiTest {
    private final Atoi atoi = new Atoi();

    @Test
    public void simpleTest() {
        Assert.assertEquals(2, atoi.myAtoi("2"));
        Assert.assertEquals(122, atoi.myAtoi("122"));
    }

    @Test
    public void leadSpaces() throws Exception {
        Assert.assertEquals(2, atoi.myAtoi("   2"));
    }

    @Test
    public void signCharacters() throws Exception {
        Assert.assertEquals(2, atoi.myAtoi("+2"));
        Assert.assertEquals(-2, atoi.myAtoi("-2"));
        Assert.assertEquals(-2, atoi.myAtoi("   -2"));
    }

    @Test
    public void breakCharacters() throws Exception {
        Assert.assertEquals(2, atoi.myAtoi("2s"));
        Assert.assertEquals(242, atoi.myAtoi("242 "));
        Assert.assertEquals(-2, atoi.myAtoi("-2-42 "));
    }

    @Test
    public void overflow() throws Exception {
        Assert.assertEquals(Integer.MAX_VALUE, atoi.myAtoi("12345678900"));
        Assert.assertEquals(Integer.MIN_VALUE, atoi.myAtoi("-12345678900"));
        Assert.assertEquals(Integer.MAX_VALUE, atoi.myAtoi(Integer.toString(Integer.MAX_VALUE)));
        Assert.assertEquals(Integer.MIN_VALUE, atoi.myAtoi(Integer.toString(Integer.MIN_VALUE)));
    }

    @Test
    public void incorrectSequences() {
        Assert.assertEquals(0, atoi.myAtoi("      "));
        Assert.assertEquals(0, atoi.myAtoi(""));
        Assert.assertEquals(0, atoi.myAtoi("--12"));
        Assert.assertEquals(0, atoi.myAtoi("- -12"));
        Assert.assertEquals(0, atoi.myAtoi("++12"));
        Assert.assertEquals(0, atoi.myAtoi("+-12"));
        Assert.assertEquals(0, atoi.myAtoi("a12"));
        Assert.assertEquals(0, atoi.myAtoi("+a12"));
    }

}