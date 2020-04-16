package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BattleshipsInABoardTest {

    @Test
    void countBattleships() {
        BattleshipsInABoard battleshipsInABoard = new BattleshipsInABoard();
        char[][] board = new char[][]{
                new char[]{'X', '.', 'X'},
                new char[]{'.', '.', 'X'},
                new char[]{'.', '.', 'X'}
        };

        assertEquals(2, battleshipsInABoard.countBattleships(board));
    }

    @Test
    void countBattleshipsHorizontal() {
        BattleshipsInABoard battleshipsInABoard = new BattleshipsInABoard();
        char[][] board = new char[][]{
                new char[]{'X', 'X', 'X'},
                new char[]{'.', '.', '.'},
                new char[]{'.', 'X', 'X'}
        };

        assertEquals(2, battleshipsInABoard.countBattleships(board));
    }

    @Test
    void countBattleshipsSingle() {
        BattleshipsInABoard battleshipsInABoard = new BattleshipsInABoard();
        char[][] board = new char[][]{new char[]{'X', 'X', 'X'}};

        assertEquals(2, battleshipsInABoard.countBattleships(board));
    }

    @Test
    void countBattleshipsEmpty() {
        BattleshipsInABoard battleshipsInABoard = new BattleshipsInABoard();
        char[][] board = new char[][]{
                new char[]{'.', '.', '.'},
                new char[]{'.', '.', '.'},
                new char[]{'.', '.', '.'}
        };

        assertEquals(2, battleshipsInABoard.countBattleships(board));
    }
}