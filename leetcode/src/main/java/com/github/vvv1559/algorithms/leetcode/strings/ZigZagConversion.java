package com.github.vvv1559.algorithms.leetcode.strings;


/*
 * Original text: https://leetcode.com/problems/zigzag-conversion/#/description
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string text, int nRows);
 *
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class ZigZagConversion {

    String convert(String s, int numRows) {
        if (s.isEmpty() || s.length() == 1 || numRows == 1 || s.length() == numRows) {
            return s;
        }

        final char[] result = s.toCharArray();
        final int lastRow = numRows - 1;
        final int charsInIteration = 2 * lastRow;

        int resultIndex = 0;
        for (int row = 0; row < numRows; row++) {
            final boolean isInnerRow = row != 0 && row != lastRow;
            final int innerRowSecondIndexShift = charsInIteration - 2 * row;

            for (int readIndex = row; readIndex < s.length(); readIndex += charsInIteration) {
                result[resultIndex++] = s.charAt(readIndex);

                if (isInnerRow) {
                    final int secondIndex = readIndex + innerRowSecondIndexShift;
                    if (secondIndex < s.length()) {
                        result[resultIndex++] = s.charAt(secondIndex);
                    } else {
                        break;
                    }
                }

            }
        }

        return new String(result);
    }
}
