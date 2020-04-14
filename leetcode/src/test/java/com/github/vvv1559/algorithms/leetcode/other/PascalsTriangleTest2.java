package com.github.vvv1559.algorithms.leetcode.other;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalsTriangleTest2 {
    private final PascalsTriangle2 pascalsTriangle = new PascalsTriangle2();

    @Test
    public void example() {
        List<Integer> expected = Arrays.asList(1, 4, 6, 4, 1);
        assertEquals(expected, pascalsTriangle.getRow(4));
    }

    @Test
    public void extremes() {
        assertEquals(Collections.singletonList(1), pascalsTriangle.getRow(0));
    }
}

