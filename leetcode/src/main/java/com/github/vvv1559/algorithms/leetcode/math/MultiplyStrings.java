package com.github.vvv1559.algorithms.leetcode.math;


/*
 * https://leetcode.com/problems/multiply-strings/description/
 *
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
 *
 * Note:
 *   The length of both num1 and num2 is < 110.
 *   Both num1 and num2 contains only digits 0-9.
 *   Both num1 and num2 does not contain any leading zero.
 *   You must not use any built-in BigInteger library or convert the inputs to integer directly.
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class MultiplyStrings {

    String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();

        int[] result = new int[n1 + n2];

        for (int i1 = n1 - 1; i1 >= 0; i1--) {
            for (int i2 = n2 - 1; i2 >= 0; i2--) {
                int mul = (num1.charAt(i1) - '0') * (num2.charAt(i2) - '0');
                int p1 = i1 + i2;
                int p2 = p1 + 1;
                int sum = mul + result[p2];

                result[p1] += sum / 10;
                result[p2] = sum % 10;
            }
        }

        StringBuilder resultBuilder = new StringBuilder(result.length);
        for (int digit : result) {
            if (resultBuilder.length() != 0 || digit != 0) {
                resultBuilder.append(digit);
            }
        }

        return resultBuilder.length() == 0 ? "0" : resultBuilder.toString();

    }
}
