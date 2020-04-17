package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {

    private static final ReverseString reverseString = new ReverseString();

    @Test
    void reverseString() {
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        reverseString.reverseString(hello);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, hello);

    }

    @Test
    void testSingle() {
        char[] one = new char[]{'a'};
        reverseString.reverseString(one);
        assertArrayEquals(new char[]{'a'}, one);
    }

    @Test
    void testEmpty() {
        char[] empty = new char[0];
        reverseString.reverseString(empty);
        assertArrayEquals(new char[0], empty);
    }

    @Test
    void testHannah() {
        char[] hannah = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString.reverseString(hannah);
        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, hannah);
    }
}