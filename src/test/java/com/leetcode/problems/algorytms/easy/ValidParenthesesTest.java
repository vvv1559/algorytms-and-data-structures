package com.leetcode.problems.algorytms.easy;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void fromExamples() throws Exception {
        Assert.assertTrue(validParentheses.isValid("()"));
        Assert.assertTrue(validParentheses.isValid("()[]{}"));
        Assert.assertFalse(validParentheses.isValid("(]"));
        Assert.assertFalse(validParentheses.isValid("([)]"));
    }

    @Test
    public void fromTests() throws Exception {
        Assert.assertFalse(validParentheses.isValid("("));
    }
}