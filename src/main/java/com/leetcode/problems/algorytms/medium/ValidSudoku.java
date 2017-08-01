package com.leetcode.problems.algorytms.medium;

import com.Difficulty;
import com.SolutionComplexity;

import static com.Difficulty.Level.MEDIUM;

/*
* Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
*
* The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
*
* Note:
*
* A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
*
* */

@Difficulty(MEDIUM)
class ValidSudoku {

    @SolutionComplexity(complexity = "O(n^2)", extraMemory = "O(n)")
    boolean isValidSudoku(char[][] board) {
        int[] usedInRows = new int[9];
        int[] usedInColumns = new int[9];
        int[] usedInSquares = new int[9];
        int dotValue = '.' - '0' - 1;
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                int value = board[row][column] - '0' - 1;
                if (value != dotValue) {
                    value = 1 << value;
                    int squareIndex = 3 * (row / 3) + column / 3;
                    if ((value & usedInRows[row]) == value ||
                        (value & usedInColumns[column]) == value ||
                        (value & usedInSquares[squareIndex]) == value) {
                        return false;
                    }

                    usedInRows[row] |= value;
                    usedInColumns[column] |= value;
                    usedInSquares[squareIndex] |= value;
                }
            }
        }
        return true;
    }
}
