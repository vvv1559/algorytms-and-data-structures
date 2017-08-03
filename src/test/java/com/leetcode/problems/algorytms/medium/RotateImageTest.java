package com.leetcode.problems.algorytms.medium;

import org.junit.Assert;
import org.junit.Test;

public class RotateImageTest {

    private RotateImage rotateImage = new RotateImage();

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
    public void rotate() throws Exception {
        for (int i = 0; i < 10; i++) {
            int[][] image = buildImage(i);
            int[][] expected = buildExpected(i);
            rotateImage.rotate(image);
            Assert.assertArrayEquals("Check " + i + "x" + i, expected, image);
        }
    }
}