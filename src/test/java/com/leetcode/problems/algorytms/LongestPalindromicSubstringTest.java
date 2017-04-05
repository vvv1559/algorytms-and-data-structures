package com.leetcode.problems.algorytms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {
    private final LongestPalindromicSubstring palindromicSubstring = new LongestPalindromicSubstring();

    @Test
    public void fromSample() throws Exception {
        final String babad = palindromicSubstring.longestPalindrome("babad");
        Assert.assertTrue("bab".equals(babad) || "aba".equals(babad));

        Assert.assertEquals("bb", palindromicSubstring.longestPalindrome("cbbd"));
    }

    @Test
    public void myCases() {
        Assert.assertEquals("pwdwp", palindromicSubstring.longestPalindrome("wpwepwdwprwpw"));
        Assert.assertEquals("pwdwp", palindromicSubstring.longestPalindrome("wpwepwdwp"));
    }

}