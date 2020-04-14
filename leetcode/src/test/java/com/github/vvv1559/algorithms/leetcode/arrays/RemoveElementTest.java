package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {
    private final RemoveElement removeElement = new RemoveElement();

    @Test
    public void examples() {
        int[] arr = new int[]{3, 2, 2, 3};
        int[] expected = new int[]{2, 2};

        int newLength = removeElement.removeElement(arr, 3);

        assertEquals(2, newLength);
        for (int i = 0; i < newLength; i++) {
            assertEquals(expected[i], arr[i]);
        }
    }

    @Test
    public void extremes() {
        assertEquals(0, removeElement.removeElement(null, 1));
        assertEquals(0, removeElement.removeElement(new int[]{3, 3, 3, 3, 3}, 3));
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        assertEquals(arrCopy.length, removeElement.removeElement(arr, 10));
        assertArrayEquals(arr, arrCopy);
    }
}