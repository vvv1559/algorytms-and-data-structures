package com.leetcode.problems.algorytms.medium;

import com.leetcode.problems.algorytms.medium.LongestSubstringWithoutRepeatingCharacters;
import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstring() throws Exception {
        final LongestSubstringWithoutRepeatingCharacters testers = new LongestSubstringWithoutRepeatingCharacters();
        Assert.assertEquals(3, testers.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, testers.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, testers.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(8, testers.lengthOfLongestSubstring("pwwkewkesfuaiiodii"));
    }

}