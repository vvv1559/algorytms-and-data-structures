package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.SolutionComplexity;

import static com.Difficulty.Level.EASY;

/*
* Original text: https://leetcode.com/problems/count-and-say/#/description
*
* The count-and-say sequence is the sequence of integers with the first five terms as following:
* 1.     1
* 2.     11
* 3.     21
* 4.     1211
* 5.     111221
* 1 is read off as "one 1" or 11.
* 11 is read off as "two 1s" or 21.
* 21 is read off as "one 2, then one 1" or 1211.
* Given an integer n, generate the nth term of the count-and-say sequence.
*
* Note: Each term of the sequence of integers will be represented as a string.
* example 1:
*
* Input: 1
* Output: "1"
*
* Example 2:
*
* Input: 4
* Output: "1211"
* */

@Difficulty(EASY)
class CountAndSay {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(1)")
    String countAndSay(int n) {
        StringBuilder result = new StringBuilder("1");
        for (int i = 1; i < n; i++) {
            StringBuilder newResult = new StringBuilder();
            byte prevNum = (byte) (result.charAt(0) - '0');
            byte numCounter = 1;
            int numsCount = result.length();
            for (int j = 1; j < numsCount; j++) {
                byte num = (byte) (result.charAt(j) - '0');
                if (num == prevNum) numCounter++;
                else {
                    newResult.append(numCounter).append(prevNum);
                    numCounter = 1;
                }
                prevNum = num;
            }

            newResult.append(numCounter).append(prevNum);
            result = newResult;
        }

        return result.toString();
    }
}
