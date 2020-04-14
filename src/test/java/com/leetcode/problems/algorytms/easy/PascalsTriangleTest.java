package com.leetcode.problems.algorytms.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalsTriangleTest {
    private PascalsTriangle pascalsTriangle = new PascalsTriangle();


    @Test
    public void example() throws Exception {
        List<List<Integer>> expected = Arrays.asList(
                Collections.singletonList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1)
        );
        assertEquals(expected, pascalsTriangle.generate(5));
    }

    @Test
    public void extremes() throws Exception {
        assertEquals(Collections.emptyList(), pascalsTriangle.generate(0));
        assertEquals(Collections.singletonList(Collections.singletonList(1)), pascalsTriangle.generate(1));
    }
}

