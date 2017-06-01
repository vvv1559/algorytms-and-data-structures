package com.leetcode.problems.algorytms;

import com.Difficulty;
import com.SolutionComplexity;

import static com.Difficulty.Level.EASY;

/*
* Original text: https://leetcode.com/problems/longest-common-prefix/#/description
*
* Write a function to find the longest common prefix string amongst an array of strings.
* */

@Difficulty(EASY)
class LongestCommonPrefix {

    @SolutionComplexity(complexity = "O(n*m)", extraMemory = "O(1)")
    String longestCommonPrefix(String[] strings) {
        if (strings.length == 0) {
            return "";
        } else if (strings.length == 1) {
            return strings[0];
        }

        final StringBuilder resultBuilder = new StringBuilder();

        char currentChar = 0;
        int position = 0;
        boolean isBreak = false;
        while (true) {
            for (int i = 0; i < strings.length; i++) {
                final String s = strings[i];
                if (position >= s.length()) {
                    isBreak = true;
                    break;
                }

                if (i == 0) {
                    currentChar = s.charAt(position);
                    continue;
                }

                if (s.charAt(position) != currentChar) {
                    isBreak = true;
                    break;
                }
            }

            if (isBreak) {
                return resultBuilder.toString();
            }
            position++;
            resultBuilder.append(currentChar);
        }
    }
}
