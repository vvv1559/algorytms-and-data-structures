package com.leetcode.problems.algorytms.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalsTriangleTest2 {
    private PascalsTriangle2 pascalsTriangle = new PascalsTriangle2();


    @Test
    public void example() throws Exception {
        List<Integer> expected = Arrays.asList(1, 4, 6, 4, 1);
        assertEquals(expected, pascalsTriangle.getRow(4));
    }

    @Test
    public void extremes() throws Exception {
        assertEquals(Collections.singletonList(1), pascalsTriangle.getRow(0));
    }
}

