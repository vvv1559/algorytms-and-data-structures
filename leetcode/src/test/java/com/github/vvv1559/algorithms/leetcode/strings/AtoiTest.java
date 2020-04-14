package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtoiTest {
    private final Atoi atoi = new Atoi();

    @Test
    public void simpleTest() {
        assertEquals(2, atoi.myAtoi("2"));
        assertEquals(122, atoi.myAtoi("122"));
    }

    @Test
    public void leadSpaces() {
        assertEquals(2, atoi.myAtoi("   2"));
    }

    @Test
    public void signCharacters() {
        assertEquals(2, atoi.myAtoi("+2"));
        assertEquals(-2, atoi.myAtoi("-2"));
        assertEquals(-2, atoi.myAtoi("   -2"));
    }

    @Test
    public void breakCharacters() {
        assertEquals(2, atoi.myAtoi("2s"));
        assertEquals(242, atoi.myAtoi("242 "));
        assertEquals(-2, atoi.myAtoi("-2-42 "));
    }

    @Test
    public void overflow() {
        assertEquals(Integer.MAX_VALUE, atoi.myAtoi("12345678900"));
        assertEquals(Integer.MIN_VALUE, atoi.myAtoi("-12345678900"));
        assertEquals(Integer.MAX_VALUE, atoi.myAtoi(Integer.toString(Integer.MAX_VALUE)));
        assertEquals(Integer.MIN_VALUE, atoi.myAtoi(Integer.toString(Integer.MIN_VALUE)));
    }

    @Test
    public void incorrectSequences() {
        assertEquals(0, atoi.myAtoi("      "));
        assertEquals(0, atoi.myAtoi(""));
        assertEquals(0, atoi.myAtoi("--12"));
        assertEquals(0, atoi.myAtoi("- -12"));
        assertEquals(0, atoi.myAtoi("++12"));
        assertEquals(0, atoi.myAtoi("+-12"));
        assertEquals(0, atoi.myAtoi("a12"));
        assertEquals(0, atoi.myAtoi("+a12"));
    }

}