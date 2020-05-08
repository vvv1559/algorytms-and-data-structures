package com.github.vvv1559.algorithms.leetcode.arrays;

/*
 * Valid Tic-Tac-Toe State
 *
 * Original text: https://leetcode.com/problems/valid-tic-tac-toe-state/
 *
 * A Tic-Tac-Toe board is given as a string array board. Return True if and only if it is possible to reach this board
 * position during the course of a valid tic-tac-toe game.
 *
 * The board is a 3 x 3 array, and consists of characters &quot; &quot;, &quot;X&quot;, and &quot;O&quot;. The &quot;
 * &quot; character represents an empty square.
 *
 * Here are the rules of Tic-Tac-Toe:
 *
 * 	Players take turns placing characters into empty squares (&quot; &quot;).
 * 	The first player always places &quot;X&quot; characters, while the second player always places &quot;O&quot;
 * characters.
 * 	&quot;X&quot; and &quot;O&quot; characters are always placed into empty squares, never filled ones.
 * 	The game ends when there are 3 of the same (non-empty) character filling any row, column, or diagonal.
 * 	The game also ends if all squares are non-empty.
 * 	No more moves can be played if the game is over.
 *
 *
 * Example 1:
 * Input: board = [&quot;O &quot;, &quot; &quot;, &quot; &quot;]
 * Output: false
 * Explanation: The first player always plays &quot;X&quot;.
 * Example 2:
 * Input: board = [&quot;XOX&quot;, &quot; X &quot;, &quot;   &quot;]
 * Output: false
 * Explanation: Players take turns making moves.
 * Example 3:
 * Input: board = [&quot;XXX&quot;, &quot;   &quot;, &quot;OOO&quot;]
 * Output: false
 * Example 4:
 * Input: board = [&quot;XOX&quot;, &quot;O O&quot;, &quot;XOX&quot;]
 * Output: true
 *
 *
 * Note:
 *
 * 	board is a length-3 array of strings, where each string board[i] has length 3.
 * 	Each board[i][j] is a character in the set {&quot; &quot;, &quot;X&quot;, &quot;O&quot;}.
 *
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class ValidTicTacToeState {
    public boolean validTicTacToe(String[] board) {
        int xDelta = 0;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                char c = board[row].charAt(col);
                if (c == 'X') {
                    xDelta++;
                } else if (c == 'O') {
                    xDelta--;
                }
            }
        }

        boolean winX = win(board, 'X');
        boolean winO = win(board, 'O');
        if (winX && winO) {
            return false;
        }
        if (winX) {
            return xDelta == 1;
        }

        if (winO) {
            return xDelta == 0;
        }

        return xDelta == 0 || xDelta == 1;
    }

    private boolean win(String[] board, char c) {
        for (int row = 0; row < 3; row++) {
            if (sameChar(board, c, row, 0, 0, 1)) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (sameChar(board, c, 0, col, 1, 0)) {
                return true;
            }
        }

        return sameChar(board, c, 0, 0, 1, 1) || sameChar(board, c, 0, 2, 1, -1);
    }

    private boolean sameChar(String[] board, char c, int row, int col, int deltaRow, int deltaCol) {
        while (row != 3 && col != 3) {
            if (board[row].charAt(col) != c) {
                return false;
            }

            row += deltaRow;
            col += deltaCol;
        }

        return true;
    }
}