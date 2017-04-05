package com.leetcode.problems.algorytms;

import org.junit.Assert;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
    @Test
    public void fromExamples() throws Exception {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        Assert.assertEquals(2, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0);
        Assert.assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0);
    }

    @Test
    public void whitOneEmpty() throws Exception {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        Assert.assertEquals(2, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[0]), 0);
        Assert.assertEquals(3.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[0], new int[]{3, 4}), 0);
    }

    @Test
    public void whitSameElements() throws Exception {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        Assert.assertEquals(2, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{3, 5}), 0);
        Assert.assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{1, 2}), 0);
    }

    @Test
    public void whitIntersections() throws Exception {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        Assert.assertEquals(3, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4}), 0);
        Assert.assertEquals(3.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6}), 0);
    }

}