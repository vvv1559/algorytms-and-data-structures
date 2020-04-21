package com.github.vvv1559.algorithms.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionAdditionAndSubtractionTest {

    @Test
    void fractionAddition() {
        FractionAdditionAndSubtraction fractionAdditionAndSubtraction = new FractionAdditionAndSubtraction();
        assertEquals("0/1", fractionAdditionAndSubtraction.fractionAddition("-1/2+1/2"));
        assertEquals("1/3", fractionAdditionAndSubtraction.fractionAddition("-1/2+1/2+1/3"));
        assertEquals("-1/6", fractionAdditionAndSubtraction.fractionAddition("1/3-1/2"));
        assertEquals("2/1", fractionAdditionAndSubtraction.fractionAddition("5/3+1/3"));
        assertEquals("-2/1", fractionAdditionAndSubtraction.fractionAddition("-5/3-1/3"));
        assertEquals("-1/3", fractionAdditionAndSubtraction.fractionAddition("-0/1-1/3"));
    }
}