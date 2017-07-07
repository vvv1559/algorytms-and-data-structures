package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.SolutionComplexity;

import static com.Difficulty.Level.EASY;

/*
* Original text: https://leetcode.com/problems/implement-strstr/#/description
*
* Implement strStr().
*
* Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*
* */

@Difficulty(EASY)
class StrStr {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(1)")
    int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean hasDif = false;
            for (int j = 0; j < needle.length(); j++) {
                if ((hasDif = (haystack.charAt(i + j) != needle.charAt(j)))) {
                    break;
                }
            }
            if (!hasDif) {
                return i;
            }
        }

        return -1;
    }
}
