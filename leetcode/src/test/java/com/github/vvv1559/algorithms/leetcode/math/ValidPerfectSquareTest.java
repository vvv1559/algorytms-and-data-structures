package com.github.vvv1559.algorithms.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPerfectSquareTest {

    @Test
    void isPerfectSquare() {
        ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
        assertTrue(validPerfectSquare.isPerfectSquare(16));
        assertFalse(validPerfectSquare.isPerfectSquare(14));
        assertTrue(validPerfectSquare.isPerfectSquare(9));
    }
}