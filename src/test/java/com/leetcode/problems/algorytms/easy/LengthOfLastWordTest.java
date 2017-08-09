package com.leetcode.problems.algorytms.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {
    private LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    public void example() throws Exception {
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World "));
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello my  World   "));
    }

    @Test
    public void extremes() throws Exception {
        assertEquals(0, lengthOfLastWord.lengthOfLastWord(""));
        assertEquals(1, lengthOfLastWord.lengthOfLastWord("a"));
        assertEquals(1, lengthOfLastWord.lengthOfLastWord("a "));
        assertEquals(1, lengthOfLastWord.lengthOfLastWord("  a  "));
        assertEquals(0, lengthOfLastWord.lengthOfLastWord("    "));
    }
}