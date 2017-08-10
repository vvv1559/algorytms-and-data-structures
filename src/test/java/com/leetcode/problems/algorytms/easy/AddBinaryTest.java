package com.leetcode.problems.algorytms.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {
    private AddBinary addBinary = new AddBinary();

    private void testTwoDigits(int first, int second) {
        final String sum = addBinary.addBinary(Integer.toBinaryString(first), Integer.toBinaryString(second));
        Assert.assertEquals(Integer.toBinaryString(first + second), sum);
    }

    @Test
    public void twoDigitsSum() throws Exception {
        testTwoDigits(10, 10);
        testTwoDigits(5, 13);
        testTwoDigits(0, 0);
        testTwoDigits(1, 0);
        testTwoDigits(1, 1);
    }
}