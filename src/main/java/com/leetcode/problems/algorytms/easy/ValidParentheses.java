package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.SolutionComplexity;

import java.util.Stack;

import static com.Difficulty.Level.EASY;

/*
* Original text: https://leetcode.com/problems/valid-parentheses/#/description
*
* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
*
* The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*
* */

@Difficulty(EASY)
class ValidParentheses {
    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(n)")
    boolean isValid(String s) {
        final Stack<Character> braces = new Stack<>();

        for (char brace : s.toCharArray()) {
            final boolean isCloseBrace = brace == ')' || brace == '}' || brace == ']';

            if (isCloseBrace) {
                if (braces.empty()) {
                    return false;
                }

                final char prevBrace = braces.pop();
                if ((brace == ')' && prevBrace != '(')
                    || (brace == '}' && prevBrace != '{')
                    || (brace == ']' && prevBrace != '[')) {
                    return false;
                }
            } else {
                braces.push(brace);
            }
        }
        return braces.empty();
    }
}
