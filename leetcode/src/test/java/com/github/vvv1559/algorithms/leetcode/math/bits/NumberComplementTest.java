package com.github.vvv1559.algorithms.leetcode.math.bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberComplementTest {

    @Test
    void findComplement() {
        NumberComplement numberComplement = new NumberComplement();
        assertEquals(2, numberComplement.findComplement(5));
    }
}