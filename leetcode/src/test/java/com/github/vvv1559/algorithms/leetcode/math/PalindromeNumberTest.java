package com.github.vvv1559.algorithms.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest {
    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void checkNegative() {
        assertFalse(palindromeNumber.isPalindrome(-1));
        assertFalse(palindromeNumber.isPalindrome(-101));
    }

    @Test
    public void checkLessThanTen() {
        assertTrue(palindromeNumber.isPalindrome(1));
        assertTrue(palindromeNumber.isPalindrome(5));
        assertTrue(palindromeNumber.isPalindrome(9));
    }

    @Test
    public void checkTrue() {
        assertTrue(palindromeNumber.isPalindrome(101));
        assertTrue(palindromeNumber.isPalindrome(10001));
        assertTrue(palindromeNumber.isPalindrome(1221));
        assertTrue(palindromeNumber.isPalindrome(1234321));
        assertTrue(palindromeNumber.isPalindrome(1006001));
    }

    @Test
    public void checkFalse() {
        assertFalse(palindromeNumber.isPalindrome(12));
        assertFalse(palindromeNumber.isPalindrome(123621));
        assertFalse(palindromeNumber.isPalindrome(1000021));
    }
}