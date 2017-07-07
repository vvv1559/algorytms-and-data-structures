package com.leetcode.problems.algorytms.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Consumer;

public class StrStrTest {
    private StrStr strStr = new StrStr();

    @Test
    public void examples() throws Exception {
        Assert.assertEquals(4, strStr.strStr("mississippi", "issip"));
    }

    @Test
    public void testStrStr() throws Exception {
        Assert.assertEquals(2, strStr.strStr("abcdef", "cd"));
        Assert.assertEquals(4, strStr.strStr("ababcd", "cd"));
        Assert.assertEquals(2, strStr.strStr("abcdcd", "cd"));
        Assert.assertEquals(0, strStr.strStr("abcdcd", "ab"));
        Assert.assertEquals(0, strStr.strStr("abcdcd", "abcdcd"));
        Assert.assertEquals(-1, strStr.strStr("abcdcd", "ba"));
    }

    @Test
    public void extremes() throws Exception {
        Assert.assertEquals(-1, strStr.strStr("", "as"));
        Assert.assertEquals(0, strStr.strStr("sa", ""));
        Assert.assertEquals(-1, strStr.strStr("sa", "ad"));
    }
}