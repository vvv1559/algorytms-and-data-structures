package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters testers = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, testers.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, testers.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, testers.lengthOfLongestSubstring("pwwkew"));
        assertEquals(8, testers.lengthOfLongestSubstring("pwwkewkesfuaiiodii"));
    }

}