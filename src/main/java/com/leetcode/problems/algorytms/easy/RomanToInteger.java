package com.leetcode.problems.algorytms.easy;

import com.common.RomanNumber;


/*
 * Original text: https://leetcode.com/problems/roman-to-integer/#/description
 *
 * Given a roman numeral, convert it to an integer.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 * */

class RomanToInteger {

    int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            final RomanNumber romanNumber = RomanNumber.fromChar(s.charAt(i));
            if (i != 0) {
                final RomanNumber prevNumber = RomanNumber.fromChar(s.charAt(i - 1));
                if (prevNumber.getIntValue() < romanNumber.getIntValue()) {
                    result += romanNumber.getIntValue() - prevNumber.getIntValue() - prevNumber.getIntValue();
                    continue;
                }
            }
            result += romanNumber.getIntValue();
        }

        return result;
    }
}
