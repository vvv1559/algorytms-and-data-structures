package com.github.vvv1559.algorithms.leetcode.strings;

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.EASY)
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
