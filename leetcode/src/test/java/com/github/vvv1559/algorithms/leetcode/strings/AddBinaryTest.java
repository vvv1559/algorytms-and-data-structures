package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {

    private final AddBinary addBinary = new AddBinary();

    private void testTwoDigits(int first, int second) {
        String sum = addBinary.addBinary(Integer.toBinaryString(first), Integer.toBinaryString(second));
        assertEquals(Integer.toBinaryString(first + second), sum);
    }

    @Test
    public void twoDigitsSum() {
        testTwoDigits(10, 10);
        testTwoDigits(5, 13);
        testTwoDigits(0, 0);
        testTwoDigits(1, 0);
        testTwoDigits(1, 1);
    }
}