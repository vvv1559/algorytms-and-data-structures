package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SearchForRangeTest {
    private static final int[] NOT_FOUND = new int[]{-1, -1};
    private final SearchForRange searchForRange = new SearchForRange();

    @Test
    public void example() {
        int[] given = new int[]{5, 7, 7, 8, 8, 10};

        assertArrayEquals(new int[]{3, 4}, searchForRange.searchRange(given, 8));
        assertArrayEquals(NOT_FOUND, searchForRange.searchRange(given, 11));
        assertArrayEquals(NOT_FOUND, searchForRange.searchRange(given, 0));
        assertArrayEquals(new int[]{5, 5}, searchForRange.searchRange(given, 10));
        assertArrayEquals(new int[]{0, 0}, searchForRange.searchRange(given, 5));
    }

    @Test
    public void extremes() {
        assertArrayEquals(NOT_FOUND, searchForRange.searchRange(new int[0], 9));
        assertArrayEquals(new int[]{0, 3}, searchForRange.searchRange(new int[]{9, 9, 9, 9}, 9));
        assertArrayEquals(NOT_FOUND, searchForRange.searchRange(new int[]{1, 1, 1, 1}, 9));
    }
}