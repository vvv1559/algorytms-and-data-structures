package com.github.vvv1559.algorithms.leetcode.arrays;


/*
 * Original text: https://leetcode.com/problems/rotate-image/description/
 *
 * You are given an n x n 2D matrix representing an image.
 *
 * Rotate the image by 90 degrees (clockwise).
 *
 * Follow up:
 * Could you do this in-place?
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class RotateImage {

    void rotate(int[][] matrix) {
        int maxN = matrix.length - 1;

        for (int i = 0; i < maxN; i++) {
            for (int j = i; j < maxN - i; j++) {
                int row = i;
                int column = j;
                int tmp = matrix[row][column];

                for (int k = 0; k <= 4; k++) {
                    int nextTmp = matrix[row][column];
                    matrix[row][column] = tmp;

                    int prevRow = row;
                    row = column;
                    column = maxN - prevRow;
                    tmp = nextTmp;
                }
            }
        }
    }

}
