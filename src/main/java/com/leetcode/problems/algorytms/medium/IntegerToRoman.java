package com.leetcode.problems.algorytms.medium;

import com.Difficulty;
import com.SolutionComplexity;
import com.common.RomanNumber;

import static com.Difficulty.Level.MEDIUM;

/*
* Original text: https://leetcode.com/problems/integer-to-roman/#/description
*
* Given an integer, convert it to a roman numeral.
*
* Input is guaranteed to be within the range from 1 to 3999.
* */

@Difficulty(MEDIUM)
class IntegerToRoman {

    @SolutionComplexity(complexity = "O(1)", extraMemory = "O(1)")
    String intToRoman(int num) {
        final StringBuilder result = new StringBuilder();

        final RomanNumber[] values = RomanNumber.values();
        int numberIndex = 0;
        while (num > 0) {
            final RomanNumber romanianNum = values[numberIndex];
            if (num >= romanianNum.getIntValue()) {
                result.append(romanianNum.name());
                num -= romanianNum.getIntValue();
            } else {
                final int nextOneIndex = numberIndex + (romanianNum.isOne() ? 2 : 1);
                if (nextOneIndex < values.length) {
                    final RomanNumber nextOne = values[nextOneIndex];
                    final int prefixVal = romanianNum.getIntValue() - nextOne.getIntValue();
                    if (prefixVal <= num) {
                        result.append(nextOne.name()).append(romanianNum.name());
                        num -= prefixVal;
                    }
                }
                numberIndex++;
            }
        }

        return result.toString();
    }
}
