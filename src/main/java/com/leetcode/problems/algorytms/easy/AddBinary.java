package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.SolutionComplexity;

import java.util.Arrays;

import static com.Difficulty.Level.EASY;

/*
* Original text: https://leetcode.com/problems/add-binary/description/
*
* Given two binary strings, return their sum (also a binary string).
*
* For example,
* a = "11"
* b = "1"
* Return "100".
* */

@Difficulty(EASY)
class AddBinary {

    @SolutionComplexity(complexity = "O(max(a, b)", extraMemory = "O(max(a, b))")
    String addBinary(String a, String b) {
        int aIndex = a.length();
        if (aIndex == 0) return b;

        int bIndex = b.length();
        if (bIndex == 0) return a;

        char[] result = new char[Math.max(aIndex, bIndex) + 1];

        for (int i = result.length - 2; i >= 0; i--) {
            int aInt = (--aIndex >= 0 ? a.charAt(aIndex) - '0' : 0);
            int bInt = (--bIndex >= 0 ? b.charAt(bIndex) - '0' : 0);
            int sum = aInt + bInt + result[i + 1];
            result[i + 1] = (char) (sum % 2 + '0');
            result[i] = (char) (sum / 2);
        }
        if (result[0] == 1) {
            result[0] += '0';
            return new String(result);
        } else {
            return new String(result, 1, result.length - 1);
        }
    }
}
