package com.leetcode.problems.algorytms.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveElementTest {
    private final RemoveElement removeElement = new RemoveElement();

    @Test
    public void examples() throws Exception {
        int[] arr = new int[]{3, 2, 2, 3};
        int[] expected = new int[]{2, 2};

        int newLength = removeElement.removeElement(arr, 3);

        Assert.assertEquals(2, newLength);
        for (int i = 0; i < newLength; i++) {
            Assert.assertEquals(expected[i], arr[i]);
        }
    }

    @Test
    public void extremes() throws Exception {
        Assert.assertEquals(0, removeElement.removeElement(null, 1));
        Assert.assertEquals(0, removeElement.removeElement(new int[]{3,3,3,3,3}, 3));
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Assert.assertEquals(arrCopy.length, removeElement.removeElement(arr, 10));
        Assert.assertArrayEquals(arr, arrCopy);
    }
}