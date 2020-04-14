package com.github.vvv1559.algorithms.leetcode.other;

import com.github.vvv1559.algorithms.structures.RomanNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanTest {
    private final IntegerToRoman integerToRoman = new IntegerToRoman();

    @Test
    public void testSimpleValues() {
        for (RomanNumber number : RomanNumber.values()) {
            assertEquals(number.name(), integerToRoman.intToRoman(number.getIntValue()));
        }
    }

    @Test
    public void testValues() {
        assertEquals("I", integerToRoman.intToRoman(1));
        assertEquals("CI", integerToRoman.intToRoman(101));
        assertEquals("CLXIII", integerToRoman.intToRoman(163));
        assertEquals("IV", integerToRoman.intToRoman(4));
        assertEquals("IX", integerToRoman.intToRoman(9));
        assertEquals("XIX", integerToRoman.intToRoman(19));
        assertEquals("XCIX", integerToRoman.intToRoman(99));
    }
}
