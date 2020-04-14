package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateArrayTest {

    private int[] arr;
    private int[] arrEven;
    private int[] arrLongEven;
    private RotateArray rotateArray;

    @BeforeEach
    public void setUp() {
        arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        arrEven = new int[]{-1, -100, 3, 99};
        arrLongEven = new int[]{1, 2, 3, 4, 5, 6};
        rotateArray = new RotateArray();
    }

    @Test
    public void rotateOne() {
        rotateArray.rotate(arr, 1);
        assertArrayEquals(new int[]{7, 1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void rotateLenPlusOne() {
        rotateArray.rotate(arr, 8);
        assertArrayEquals(new int[]{7, 1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    @Disabled
    public void rotateMinusOne() {
        rotateArray.rotate(arr, -1);
        assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7, 1}, arr);
    }

    @Test
    public void rotateTwo() {
        rotateArray.rotate(arr, 2);
        assertArrayEquals(new int[]{6, 7, 1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void rotateThree() {
        rotateArray.rotate(arr, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, arr);
    }

    @Test
    public void rotateEvenOne() {
        rotateArray.rotate(arrEven, 1);
        assertArrayEquals(new int[]{99, -1, -100, 3}, arrEven);
    }

    @Test
    public void rotateEvenHalf() {
        rotateArray.rotate(arrEven, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, arrEven);
    }

    @Test
    public void rotateLongEvenTwo() {
        rotateArray.rotate(arrLongEven, 2);
        assertArrayEquals(new int[]{5, 6, 1, 2, 3, 4}, arrLongEven);
    }

    @Test
    public void rotateLongEvenThree() {
        rotateArray.rotate(arrLongEven, 3);
        assertArrayEquals(new int[]{4, 5, 6, 1, 2, 3}, arrLongEven);
    }

    @Test
    public void rotateLongEvenFour() {
        rotateArray.rotate(arrLongEven, 4);
        assertArrayEquals(new int[]{3, 4, 5, 6, 1, 2}, arrLongEven);
    }
}