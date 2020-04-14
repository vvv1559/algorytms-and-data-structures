package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {
    @Test
    public void fromExamples() {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        assertEquals(2, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0);
        assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0);
    }

    @Test
    public void whitOneEmpty() {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        assertEquals(2, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[0]), 0);
        assertEquals(3.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[0], new int[]{3, 4}), 0);
    }

    @Test
    public void whitSameElements() {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        assertEquals(3, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{3, 5}), 0);
        assertEquals(1.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{1, 2}), 0);
    }

    @Test
    public void whitIntersections() {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        assertEquals(3, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4}), 0);
        assertEquals(3.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6}), 0);
    }

}