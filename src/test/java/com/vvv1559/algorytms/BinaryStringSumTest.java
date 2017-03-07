package com.vvv1559.algorytms;

import org.junit.Assert;
import org.junit.Test;

public class BinaryStringSumTest {

    private void testTwoDigits(int first, int second) {
        final String sum = BinaryStringSum.twoDigitsSum(Integer.toBinaryString(first), Integer.toBinaryString(second));
        Assert.assertEquals(Integer.toBinaryString(first + second), sum);
    }

    @Test
    public void twoDigitsSum() throws Exception {
        testTwoDigits(10, 10);
        testTwoDigits(5, 13);
        testTwoDigits(1, 0);
        testTwoDigits(0, 0);
        testTwoDigits(1, 1);
    }

}