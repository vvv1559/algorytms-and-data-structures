package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StringCompressionTest {

    @Test
    void compress() {
        StringCompression stringCompression = new StringCompression();
        char[] str = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = stringCompression.compress(str);
        char[] result = Arrays.copyOf(str, newLength);
        assertArrayEquals(new char[]{'a', '2', 'b', '2', 'c', '3'}, result);
    }

    @Test
    void compressSingle() {
        StringCompression stringCompression = new StringCompression();
        char[] str = {'a'};
        int newLength = stringCompression.compress(str);
        char[] result = Arrays.copyOf(str, newLength);
        assertArrayEquals(new char[]{'a'}, result);
    }

    @Test
    void compressHigh() {
        StringCompression stringCompression = new StringCompression();
        char[] str = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int newLength = stringCompression.compress(str);
        char[] result = Arrays.copyOf(str, newLength);
        assertArrayEquals(new char[]{'a', 'b', '1', '2'}, result);
    }
}