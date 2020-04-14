package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    public void example() {
        int[] arr = new int[]{1, 1, 2};
        int newLength = removeDuplicatesFromSortedArray.removeDuplicates(arr);
        assertEquals(2, newLength);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
    }

    @Test
    public void extremes() {
        assertEquals(0, removeDuplicatesFromSortedArray.removeDuplicates(new int[0]));
        int[] arr = {1, 1, 1, 1};
        int newLength = removeDuplicatesFromSortedArray.removeDuplicates(arr);
        assertEquals(1, newLength);
        assertEquals(1, arr[0]);
    }
}