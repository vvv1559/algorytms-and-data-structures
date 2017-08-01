package com.leetcode.problems.algorytms.medium;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidSudokuTest {

    private ValidSudoku validSudoku = new ValidSudoku();

    @Test
    public void example() throws Exception {
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