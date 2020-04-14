package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateImageTest {

    private final RotateImage rotateImage = new RotateImage();

    private int[][] buildImage(int n) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = i;
            }
        }

        return result;
    }

    private int[][] buildExpected(int n) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = n - 1 - j;
            }
        }

        return result;
    }

    @Test
    public void rotate() {
        for (int i = 0; i < 10; i++) {
            int[][] image = buildImage(i);
            int[][] expected = buildExpected(i);
            rotateImage.rotate(image);
            assertArrayEquals(expected, image, "Check " + i + "x" + i);
        }
    }
}