package com.github.vvv1559.algorithms.leetcode.arrays;

/*
 * Battleships in a Board
 *
 * Original text: https://leetcode.com/problems/battleships-in-a-board/
 * Given an 2D board, count how many battleships are in it. The battleships are represented with 'X's, empty slots are
 * represented with '.'s. You may assume the following rules:
 *
 * You receive a valid board, made of only battleships or empty slots.
 * Battleships can only be placed horizontally or vertically. In other words, they can only be made of the shape 1xN (1
 * row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
 * At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.
 *
 *
 * Example:
 * X..X
 * ...X
 * ...X
 *
 * In the above board there are 2 battleships.
 *
 * Invalid Example:
 * ...X
 * XXXX
 * ...X
 *
 * This is an invalid board that you will not receive - as battleships will always have a cell separating between them.
 *
 * Follow up:Could you do it in one-pass, using only O(1) extra memory and without modifying the value of the board?
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int count = 0;
        for (int rowNum = 0; rowNum < board.length; rowNum++) {
            for (int colNum = 0; colNum < board[0].length; colNum++) {
                if (board[rowNum][colNum] == '.') continue;
                if (rowNum > 0 && board[rowNum - 1][colNum] == 'X') continue;
                if (colNum > 0 && board[rowNum][colNum - 1] == 'X') continue;
                count++;
            }
        }

        return count;
    }
}