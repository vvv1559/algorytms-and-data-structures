package com.github.vvv1559.algorithms.leetcode.other;

/*
 * Valid Square
 *
 * Original text: https://leetcode.com/problems/valid-square/
 *
 * Given the coordinates of four points in 2D space, return whether the four points could construct a square.
 *
 * The coordinate (x,y) of a point is represented by an integer array with two integers.
 *
 * Example:
 *
 * Input: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
 * Output: True
 *
 *
 * Note:
 *
 * 	All the input integers are in the range [-10000, 10000].
 * 	A valid square has four equal sides with positive length and four equal angles (90-degree angles).
 * 	Input points have no order.
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class ValidSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] points = new int[][]{p1, p2, p3, p4};
        int len1 = Integer.MIN_VALUE;
        int len2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int squaredDistance = getSquaredDistance(points[i], points[j]);
                if (squaredDistance == 0) {
                    return false;
                }

                if (len1 == Integer.MIN_VALUE) {
                    len1 = squaredDistance;
                    count1++;
                } else if (len1 != squaredDistance && len2 == Integer.MIN_VALUE) {
                    len2 = squaredDistance;
                    count2++;
                } else if (len1 == squaredDistance) {
                    count1++;
                } else if (len2 == squaredDistance) {
                    count2++;
                } else {
                    return false;
                }
            }
        }

        return len1 < len2 ? count1 == 4 && count2 == 2 : count1 == 2 && count2 == 4;
    }

    private int getSquaredDistance(int[] p1, int[] p2) {
        int xDiff = p1[0] - p2[0];
        int yDiff = p1[1] - p2[1];
        return xDiff * xDiff + yDiff * yDiff;
    }
}