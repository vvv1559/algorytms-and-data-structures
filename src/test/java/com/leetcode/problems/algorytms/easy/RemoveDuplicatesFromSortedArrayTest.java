package com.leetcode.problems.algorytms.easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    public void example() throws Exception {
        int[] arr = new int[]{1, 1, 2};
        int newLength = removeDuplicatesFromSortedArray.removeDuplicates(arr);
        Assert.assertEquals(2, newLength);
        Assert.assertEquals(1, arr[0]);
        Assert.assertEquals(2, arr[1]);
    }

    @Test
    public void extremes() throws Exception {
        Assert.assertEquals(0, removeDuplicatesFromSortedArray.removeDuplicates(new int[0]));
        int[] arr = {1, 1, 1, 1};
        int newLength = removeDuplicatesFromSortedArray.removeDuplicates(arr);
        Assert.assertEquals(1, newLength);
        Assert.assertEquals(1, arr[0]);
    }
}