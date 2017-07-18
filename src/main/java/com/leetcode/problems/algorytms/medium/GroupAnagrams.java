package com.leetcode.problems.algorytms.medium;

import com.Difficulty;
import com.SolutionComplexity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.Difficulty.Level.MEDIUM;

/*
* Original text: https://leetcode.com/problems/powx-n/#/description
*
* Implement pow(x, n).
*
* */

@Difficulty(MEDIUM)
class GroupAnagrams {

    @SolutionComplexity(complexity = "O(1)", extraMemory = "O(1)")
    List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupsMap = new HashMap<>();

        for (String str : strs) {
            int[] indexes = new int[27];

            for (char ch : str.toCharArray()) {
                indexes[ch - 'a']++;
            }

            StringBuilder stringBuilder = new StringBuilder(str.length());
            for (int i = 0; i < indexes.length; i++) {
                for (int j = 0; j < indexes[i]; j++) {
                    stringBuilder.append((char) (i - 1 + 'a'));
                }
            }

            String key = stringBuilder.toString();
            List<String> words = groupsMap.get(key);
            words = words == null ? new ArrayList<>() : words;
            words.add(str);
            groupsMap.put(key, words);
        }

        return new ArrayList<>(groupsMap.values());
    }
}
