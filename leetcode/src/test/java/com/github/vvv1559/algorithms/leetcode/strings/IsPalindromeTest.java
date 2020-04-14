package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsPalindromeTest {
    private final IsPalindrome isPalindrome = new IsPalindrome();

    @Test
    public void examples() {
        assertTrue(isPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(isPalindrome.isPalindrome("race a car"));
    }

    @Test
    public void extremes() {
        assertTrue(isPalindrome.isPalindrome(" A man, a plan,  a canal:  Panama; "));
        assertFalse(isPalindrome.isPalindrome("0P"));

    }
}