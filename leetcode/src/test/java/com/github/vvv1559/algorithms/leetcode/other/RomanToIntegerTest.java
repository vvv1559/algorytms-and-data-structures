package com.github.vvv1559.algorithms.leetcode.other;

import com.github.vvv1559.algorithms.structures.RomanNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {
    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    public void testSimpleValues() {
        for (RomanNumber number : RomanNumber.values()) {
            assertEquals(number.getIntValue(), romanToInteger.romanToInt(number.name()));
        }
    }

    @Test
    public void testValues() {
        assertEquals(1, romanToInteger.romanToInt("I"));
        assertEquals(101, romanToInteger.romanToInt("CI"));
        assertEquals(163, romanToInteger.romanToInt("CLXIII"));
        assertEquals(4, romanToInteger.romanToInt("IV"));
        assertEquals(9, romanToInteger.romanToInt("IX"));
        assertEquals(19, romanToInteger.romanToInt("XIX"));
        assertEquals(99, romanToInteger.romanToInt("XCIX"));
    }
}
