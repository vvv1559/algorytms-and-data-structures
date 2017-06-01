package com.leetcode.problems.algorytms;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void commonTests() throws Exception {
        Assert.assertEquals("ab", longestCommonPrefix.longestCommonPrefix(new String[]{"abba", "abca"}));
        Assert.assertEquals("abb", longestCommonPrefix.longestCommonPrefix(new String[]{"abba", "abbca"}));
        Assert.assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"aabba", "abbca"}));
    }

    @Test
    public void withDifferentLens() throws Exception {
        Assert.assertEquals("ab", longestCommonPrefix.longestCommonPrefix(new String[]{"ab", "abca"}));
        Assert.assertEquals("abca", longestCommonPrefix.longestCommonPrefix(new String[]{"abca", "abcafd"}));
    }

    @Test
    public void withEmptyArray() throws Exception {
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"ab", ""}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"", "abcafd"}));
    }

    @Test
    public void extremes() throws Exception {
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[0]));
        Assert.assertEquals("abba", longestCommonPrefix.longestCommonPrefix(new String[]{"abba"}));
    }
}