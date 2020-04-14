package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring palindromicSubstring = new LongestPalindromicSubstring();

    @Test
    public void fromSample() {
        String babad = palindromicSubstring.longestPalindrome("babad");
        assertTrue("bab".equals(babad) || "aba".equals(babad));

        assertEquals("bb", palindromicSubstring.longestPalindrome("cbbd"));
    }

    @Test
    public void myCases() {
        assertEquals("pwdwp", palindromicSubstring.longestPalindrome("wpwepwdwprwpw"));
        assertEquals("pwdwp", palindromicSubstring.longestPalindrome("wpwepwdwp"));
    }

}