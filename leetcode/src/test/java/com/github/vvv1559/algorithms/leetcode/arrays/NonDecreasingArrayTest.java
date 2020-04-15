package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NonDecreasingArrayTest {

    @Test
    void checkPossibility() {
        NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();
        assertTrue(nonDecreasingArray.checkPossibility(new int[]{4, 2, 3}));
        assertTrue(nonDecreasingArray.checkPossibility(new int[]{1, 1, 1}));
        assertTrue(nonDecreasingArray.checkPossibility(new int[]{2, 3, 3, 2, 4}));
        assertFalse(nonDecreasingArray.checkPossibility(new int[]{4, 2, 1}));
        assertFalse(nonDecreasingArray.checkPossibility(new int[]{1, 6, 6, 1, 2}));
        assertFalse(nonDecreasingArray.checkPossibility(new int[]{4, 2, 3, 7, 3}));
    }
}