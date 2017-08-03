package com.leetcode.problems.algorytms.medium;

import com.Difficulty;
import com.SolutionComplexity;

import static com.Difficulty.Level.MEDIUM;

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

@Difficulty(MEDIUM)
class RotateImage {

    @SolutionComplexity(complexity = "O(n^2)", extraMemory = "O(1)")
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
