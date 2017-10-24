package com.leetcode.problems.algorytms.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindromeTest {
    private IsPalindrome isPalindrome = new IsPalindrome();

    @Test
    public void examples() throws Exception {
        assertTrue(isPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(isPalindrome.isPalindrome("race a car"));
    }

    @Test
    public void extremes() throws Exception {
        assertTrue(isPalindrome.isPalindrome(" A man, a plan,  a canal:  Panama; "));
        assertFalse(isPalindrome.isPalindrome("0P"));

    }
}