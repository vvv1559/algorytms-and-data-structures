package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidTicTacToeStateTest {

    @Test
    void validTicTacToe() {
        ValidTicTacToeState validTicTacToeState = new ValidTicTacToeState();
        assertFalse(validTicTacToeState.validTicTacToe(new String[]{"O  ", "   ", "   "}));
        assertFalse(validTicTacToeState.validTicTacToe(new String[]{"XOX", " X ", "   "}));
        assertFalse(validTicTacToeState.validTicTacToe(new String[]{"XXX", "   ", "OOO"}));
        assertFalse(validTicTacToeState.validTicTacToe(new String[]{"XO ", "XO ", "XO "}));
        assertFalse(validTicTacToeState.validTicTacToe(new String[]{"XXX", "XOO", "OO "}));
        assertFalse(validTicTacToeState.validTicTacToe(new String[]{"OXX", "XOX", "OXO"}));

        assertTrue(validTicTacToeState.validTicTacToe(new String[]{"XOX", "O O", "XOX"}));
        assertTrue(validTicTacToeState.validTicTacToe(new String[]{"XXX", "O O", " OX"}));
        assertTrue(validTicTacToeState.validTicTacToe(new String[]{" OX", "OX ", "X  "}));
        assertTrue(validTicTacToeState.validTicTacToe(new String[]{"XX ", "OOO", "X  "}));
    }
}