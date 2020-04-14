package com.github.vvv1559.algorithms.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void fromExamples() {
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("()[]{}"));
        assertFalse(validParentheses.isValid("(]"));
        assertFalse(validParentheses.isValid("([)]"));
    }

    @Test
    public void fromTests() {
        assertFalse(validParentheses.isValid("("));
    }
}