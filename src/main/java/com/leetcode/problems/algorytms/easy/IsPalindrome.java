package com.leetcode.problems.algorytms.easy;


/*
 * Original text: https://leetcode.com/problems/valid-palindrome/description/
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,
 *
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 *
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * For the purpose of this problem, we define empty string as valid palindrome.
 * */

class IsPalindrome {

    boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char startChar = Character.toLowerCase(s.charAt(start));
            char endChar = Character.toLowerCase(s.charAt(end));

            if (!Character.isLetter(startChar) && !Character.isDigit(startChar)) {
                start++;
            } else if (!Character.isLetter(endChar) && !Character.isDigit(endChar)) {
                end--;
            } else if (startChar != endChar) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        return true;
    }
}
