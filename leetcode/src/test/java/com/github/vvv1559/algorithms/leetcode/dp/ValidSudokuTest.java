package com.github.vvv1559.algorithms.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidSudokuTest {

    private final ValidSudoku validSudoku = new ValidSudoku();

    @Test
    public void example() {
        char[][] example = new char[][]{
                ".87654321".toCharArray(),
                "2........".toCharArray(),
                "3........".toCharArray(),
                "4........".toCharArray(),
                "5........".toCharArray(),
                "6........".toCharArray(),
                "7........".toCharArray(),
                "8........".toCharArray(),
                "9........".toCharArray()
        };
        assertTrue(validSudoku.isValidSudoku(example));
    }
}