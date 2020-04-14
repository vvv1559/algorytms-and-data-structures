package com.github.vvv1559.algorithms.leetcode.strings;

/*
 * Original text: https://leetcode.com/problems/longest-palindromic-substring/#/description
 *
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example:
 *
 * Input: "babad"
 * Output: "bab"
 *
 * Note: "aba" is also a valid answer.
 *
 * Example:
 *
 * Input: "cbbd"
 * Output: "bb"
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class LongestPalindromicSubstring {
    private int[] findMaxPalindromeRange(String s, int start, int end) {
        int[] range = new int[2];
        for (int i = start, j = end; i >= 0 && j < s.length(); i--, j++) {
            if (s.charAt(i) == s.charAt(j)) {
                range[0] = i;
                range[1] = j;
            } else {
                return range;
            }
        }

        return range;
    }

    private int rangeLen(int[] range) {
        return range[1] - range[0];
    }

    String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        int[] maxRange = new int[]{0, 0};

        for (int i = 0; i < s.length(); i++) {
            int[] range = findMaxPalindromeRange(s, i, i);
            if (rangeLen(range) > rangeLen(maxRange)) {
                maxRange = range;
            }

            range = findMaxPalindromeRange(s, i, i + 1);
            if (rangeLen(range) > rangeLen(maxRange)) {
                maxRange = range;
            }
        }

        return s.substring(maxRange[0], maxRange[1] + 1);
    }
}
