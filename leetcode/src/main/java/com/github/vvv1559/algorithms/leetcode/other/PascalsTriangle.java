package com.github.vvv1559.algorithms.leetcode.other;

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
 * Original text: https://leetcode.com/problems/pascals-triangle/description/
 *
 * Given numRows, generate the first numRows of Pascal's triangle.
 *
 * For example, given numRows = 5,
 * Return
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * */

@Difficulty(Level.EASY)
class PascalsTriangle {

    List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);

            for (int j = 1; j < prevRow.size(); j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currRow.add(1);

            result.add(currRow);
        }
        return result;
    }
}
