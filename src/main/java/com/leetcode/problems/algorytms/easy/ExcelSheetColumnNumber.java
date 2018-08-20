package com.leetcode.problems.algorytms.easy;

import com.Difficulty;

import static com.Difficulty.Level.EASY;


@Difficulty(EASY)
class ExcelSheetColumnNumber {

    int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result *= 26;
            result += s.charAt(i) - 'A' + 1;
        }

        return result;
    }
}
