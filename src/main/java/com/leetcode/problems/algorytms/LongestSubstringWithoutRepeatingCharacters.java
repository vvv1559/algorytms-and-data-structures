package com.leetcode.problems.algorytms;

import com.Difficulty;
import com.SolutionComplexity;

import java.util.HashSet;
import java.util.Set;

import static com.Difficulty.Level.MEDIUM;

/*
* Original text: https://leetcode.com/problems/longest-substring-without-repeating-characters/#/description
*
* Given a string, find the length of the longest substring without repeating characters.
*
* Examples:
*
* Given "abcabcbb", the answer is "abc", which the length is 3.
* Given "bbbbb", the answer is "b", with the length of 1.
*
* Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
* */

@Difficulty(MEDIUM)
class LongestSubstringWithoutRepeatingCharacters {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(n)")
    int lengthOfLongestSubstring(String s) {
        int startPosition = 0;
        int endPosition = 0;
        int maxLen = 0;
        Set<Character> characters = new HashSet<>();

        while (endPosition < s.length()) {
            char newCharacter = s.charAt(endPosition);
            while (characters.contains(newCharacter)) {
                characters.remove(s.charAt(startPosition));
                startPosition++;
            }

            characters.add(newCharacter);
            endPosition++;

            maxLen = Math.max(maxLen, endPosition - startPosition);
        }

        return maxLen;
    }
}
