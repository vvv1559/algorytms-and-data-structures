package com.github.vvv1559.algorithms.leetcode.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidSquareTest {

    @Test
    void validSquare() {
        ValidSquare validSquare = new ValidSquare();

        assertTrue(validSquare.validSquare(new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 0}, new int[]{0, 1}));
        assertTrue(validSquare.validSquare(new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 0}, new int[]{0, 1}));
        assertTrue(validSquare.validSquare(new int[]{10000, 10000}, new int[]{-10000, -10000}, new int[]{-10000, 10000}, new int[]{10000, -10000}));
        assertTrue(validSquare.validSquare(new int[]{1, 1}, new int[]{1, -1}, new int[]{-1, 1}, new int[]{-1, -1}));
        assertTrue(validSquare.validSquare(new int[]{1, 0}, new int[]{-1, 0}, new int[]{0, 1}, new int[]{0, -1}));

        assertFalse(validSquare.validSquare(new int[]{1, 2}, new int[]{1, 1}, new int[]{1, 0}, new int[]{0, 1}));
        assertFalse(validSquare.validSquare(new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}));
        assertFalse(validSquare.validSquare(new int[]{10000, 10000}, new int[]{-10000, -10000}, new int[]{-10000, 10000}, new int[]{10000, -9999}));
        assertFalse(validSquare.validSquare(new int[]{0, 0}, new int[]{0, 0}, new int[]{1, 0}, new int[]{0, 1}));
    }
}