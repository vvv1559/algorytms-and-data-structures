package com.leetcode.problems.algorytms;

import com.Difficulty;
import com.SolutionComplexity;

import static com.Difficulty.Level.MEDIUM;

/*
* Original text: https://leetcode.com/problems/string-to-integer-atoi/#/description
*
* Implement atoi to convert a string to an integer.
*
* Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself
* what are the possible input cases.
*
* Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to
* gather all the input requirements up front.
*
* Requirements for atoi:
* The function first discards as many whitespace characters as necessary until the first non-whitespace character is
* found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical
* digits as possible, and interprets them as a numerical value.
*
* The string can contain additional characters after those that form the integral number, which are ignored and have no
* effect on the behavior of this function.
*
* If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence
* exists because either str is empty or it contains only whitespace characters, no conversion is performed.
*
* If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of
* representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
*
* */

@Difficulty(MEDIUM)
class Atoi {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(1)")
    int myAtoi(String str) {
        int result = 0;
        int sign = 1;

        int position = 0;
        while (position < str.length() && str.charAt(position) == ' ') {
            position++;
        }

        if (position < str.length() && (str.charAt(position) == '-' || str.charAt(position) == '+')) {
            sign = str.charAt(position) == '-' ? -sign : sign;
            position++;
        }

        for (int i = position; i < str.length(); i++){
            if (str.charAt(i) < '0' || str.charAt(i) > '9'){
                break;
            }

            final int newResult = result * 10 + str.charAt(i) - '0';
             if (newResult / 10 != result) {
                return (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = newResult;
        }

        return sign * result;
    }
}
