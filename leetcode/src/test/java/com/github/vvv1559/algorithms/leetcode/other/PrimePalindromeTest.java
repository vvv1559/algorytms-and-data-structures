package com.github.vvv1559.algorithms.leetcode.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimePalindromeTest {

    @Test
    void primePalindrome() {
        PrimePalindrome primePalindrome = new PrimePalindrome();
        assertEquals(2, primePalindrome.primePalindrome(1));
        assertEquals(2, primePalindrome.primePalindrome(2));
        assertEquals(7, primePalindrome.primePalindrome(6));
        assertEquals(11, primePalindrome.primePalindrome(8));
        assertEquals(101, primePalindrome.primePalindrome(13));
        assertEquals(100030001, primePalindrome.primePalindrome(9989900));
    }
}