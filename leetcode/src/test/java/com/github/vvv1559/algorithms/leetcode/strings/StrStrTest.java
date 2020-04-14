package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrStrTest {
    private final StrStr strStr = new StrStr();

    @Test
    public void examples() {
        assertEquals(4, strStr.strStr("mississippi", "issip"));
    }

    @Test
    public void testStrStr() {
        assertEquals(2, strStr.strStr("abcdef", "cd"));
        assertEquals(4, strStr.strStr("ababcd", "cd"));
        assertEquals(2, strStr.strStr("abcdcd", "cd"));
        assertEquals(0, strStr.strStr("abcdcd", "ab"));
        assertEquals(0, strStr.strStr("abcdcd", "abcdcd"));
        assertEquals(-1, strStr.strStr("abcdcd", "ba"));
    }

    @Test
    public void extremes() {
        assertEquals(-1, strStr.strStr("", "as"));
        assertEquals(0, strStr.strStr("sa", ""));
        assertEquals(-1, strStr.strStr("sa", "ad"));
    }
}