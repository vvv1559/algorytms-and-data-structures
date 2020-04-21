package com.github.vvv1559.algorithms.leetcode.math;

/*
 * Fraction Addition and Subtraction
 *
 * Original text: https://leetcode.com/problems/fraction-addition-and-subtraction/
 *
 * Given a string representing an expression of fraction addition and subtraction, you need to return the calculation
 * result in string format. The final result should be irreducible fraction. If your final result is an integer, say 2,
 * you need to change it to the format of fraction that has denominator 1. So in this case, 2 should be converted to 2/1.
 *
 * Example 1:
 *
 * Input:"-1/2+1/2"
 * Output: "0/1"
 *
 *
 *
 * Example 2:
 *
 * Input:"-1/2+1/2+1/3"
 * Output: "1/3"
 *
 *
 *
 * Example 3:
 *
 * Input:"1/3-1/2"
 * Output: "-1/6"
 *
 *
 *
 * Example 4:
 *
 * Input:"5/3+1/3"
 * Output: "2/1"
 *
 *
 *
 * Note:
 *
 * The input string only contains '0' to '9', '/', '+' and '-'. So does the output.
 * Each fraction (input and output) has format ±numerator/denominator. If the first input fraction or the output is
 * positive, then '+' will be omitted.
 * The input only contains valid irreducible fractions, where the numerator and denominator of each fraction will always
 * be in the range [1,10]. If the denominator is 1, it means this fraction is actually an integer in a fraction format
 * defined above.
 * The number of given fractions will be in the range [1,10].
 * The numerator and denominator of the final result are guaranteed to be valid and in the range of 32-bit int.
 *
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class FractionAdditionAndSubtraction {

    public String fractionAddition(String expression) {
        int resNumerator = 0;
        int resDenominator = 1;

        int curNumerator = 0;
        int curDenominator = 0;
        boolean numeratorReading = true;
        int sign = 1;

        for (int i = 0; i <= expression.length(); i++) {
            if (i != expression.length()) {

                char ch = expression.charAt(i);
                if (Character.isDigit(ch)) {
                    int val = ch - '0';
                    if (numeratorReading) {
                        curNumerator = curNumerator * 10 + val;
                    } else {
                        curDenominator = curDenominator * 10 + val;
                    }
                    continue;
                } else if (ch == '/') {
                    numeratorReading = false;
                    continue;
                } else if (ch == '-') {
                    if (numeratorReading) {
                        sign = -1;
                        continue;
                    }

                    i--;
                }
            }

            resNumerator = resNumerator * curDenominator + sign * curNumerator * resDenominator;
            resDenominator *= curDenominator;

            int divider = greatestCommonDivider(resNumerator, resDenominator);
            resNumerator /= divider;
            resDenominator /= divider;

            curNumerator = 0;
            curDenominator = 0;
            numeratorReading = true;
            sign = 1;
        }

        return resNumerator + "/" + resDenominator;
    }

    private int greatestCommonDivider(int a, int b) {
        a = Math.abs(a);
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}