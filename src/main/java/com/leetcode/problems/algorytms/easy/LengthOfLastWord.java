package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.SolutionComplexity;

import static com.Difficulty.Level.EASY;

/*
* Original text: https://leetcode.com/problems/length-of-last-word/description/
*
* Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last
* word in the string.
*
* If the last word does not exist, return 0.
*
* Note: A word is defined as a character sequence consists of non-space characters only.
*
* For example,
* Given s = "Hello World",
* return 5.
*
* * */

@Difficulty(EASY)
class LengthOfLastWord {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(1)")
    int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ')  start--;

        return end - start;
    }
}
