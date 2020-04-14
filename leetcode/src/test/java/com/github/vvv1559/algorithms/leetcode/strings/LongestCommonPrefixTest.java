package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {
    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void commonTests() {
        assertEquals("ab", longestCommonPrefix.longestCommonPrefix(new String[]{"abba", "abca"}));
        assertEquals("abb", longestCommonPrefix.longestCommonPrefix(new String[]{"abba", "abbca"}));
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"aabba", "abbca"}));
    }

    @Test
    public void withDifferentLens() {
        assertEquals("ab", longestCommonPrefix.longestCommonPrefix(new String[]{"ab", "abca"}));
        assertEquals("abca", longestCommonPrefix.longestCommonPrefix(new String[]{"abca", "abcafd"}));
    }

    @Test
    public void withEmptyArray() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"ab", ""}));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"", "abcafd"}));
    }

    @Test
    public void extremes() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[0]));
        assertEquals("abba", longestCommonPrefix.longestCommonPrefix(new String[]{"abba"}));
    }
}