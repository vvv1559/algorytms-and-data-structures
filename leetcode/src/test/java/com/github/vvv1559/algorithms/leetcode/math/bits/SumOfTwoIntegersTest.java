package com.github.vvv1559.algorithms.leetcode.math.bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfTwoIntegersTest {

    @Test
    void getSum() {
        SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();
        assertEquals(3, sumOfTwoIntegers.getSum(1, 2));
        assertEquals(0, sumOfTwoIntegers.getSum(1, -1));
        assertEquals(-3, sumOfTwoIntegers.getSum(-1, -2));
        assertEquals(40, sumOfTwoIntegers.getSum(25, 15));
    }
}