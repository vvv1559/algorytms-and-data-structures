package com.leetcode.problems.algorytms.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPositionTest {
    private SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    public void examples() throws Exception {
        assertEquals(2, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}