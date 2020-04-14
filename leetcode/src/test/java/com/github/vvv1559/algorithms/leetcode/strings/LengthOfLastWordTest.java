package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLastWordTest {
    private LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    public void example() {
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World "));
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello my  World   "));
    }

    @Test
    public void extremes() {
        assertEquals(0, lengthOfLastWord.lengthOfLastWord(""));
        assertEquals(1, lengthOfLastWord.lengthOfLastWord("a"));
        assertEquals(1, lengthOfLastWord.lengthOfLastWord("a "));
        assertEquals(1, lengthOfLastWord.lengthOfLastWord("  a  "));
        assertEquals(0, lengthOfLastWord.lengthOfLastWord("    "));
    }
}