package com.leetcode.problems.algorytms.easy;


/*
 * Original text: https://leetcode.com/problems/palindrome-number/#/description
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 * */

class PalindromeNumber {

    boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        boolean numStarted = false;
        for (int i = (int) Math.pow(10, 9); i != 0; i /= numStarted ? 100 : 10) {
            final int firstDigit = x / i;
            if (firstDigit != 0 || numStarted) {
                final int lastDigit = x % 10;
                if (firstDigit != lastDigit) {
                    return false;
                }

                x = (x - firstDigit * i) / 10;
                numStarted = true;
            }
        }

        return true;
    }
}
