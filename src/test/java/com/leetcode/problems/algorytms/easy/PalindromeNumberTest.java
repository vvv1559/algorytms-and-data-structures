package com.leetcode.problems.algorytms.easy;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {
    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void checkNegative() {
        Assert.assertFalse(palindromeNumber.isPalindrome(-1));
        Assert.assertFalse(palindromeNumber.isPalindrome(-101));
    }

    @Test
    public void checkLessThanTen() {
        Assert.assertTrue(palindromeNumber.isPalindrome(1));
        Assert.assertTrue(palindromeNumber.isPalindrome(5));
        Assert.assertTrue(palindromeNumber.isPalindrome(9));
    }

    @Test
    public void checkTrue() {
        Assert.assertTrue(palindromeNumber.isPalindrome(101));
        Assert.assertTrue(palindromeNumber.isPalindrome(10001));
        Assert.assertTrue(palindromeNumber.isPalindrome(1221));
        Assert.assertTrue(palindromeNumber.isPalindrome(1234321));
        Assert.assertTrue(palindromeNumber.isPalindrome(1006001));
    }

    @Test
    public void checkFalse() {
        Assert.assertFalse(palindromeNumber.isPalindrome(12));
        Assert.assertFalse(palindromeNumber.isPalindrome(123621));
        Assert.assertFalse(palindromeNumber.isPalindrome(1000021));
    }
}