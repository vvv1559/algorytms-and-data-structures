package com.github.vvv1559.algorithms.leetcode.trees;

import com.github.vvv1559.algorithms.structures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;


public class SwapNodesInPairsTest {
    private SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

    @Test
    public void examples() {
        ListNode node = ListNode.buildList(1, 2, 3, 4);
        ListNode expected = ListNode.buildList(2, 1, 4, 3);
        assertEquals(expected, swapNodesInPairs.swapPairs(node));
    }

    @Test
    public void oddLength() {
        ListNode node = ListNode.buildList(1, 2, 3);
        ListNode expected = ListNode.buildList(2, 1, 3);
        assertEquals(expected, swapNodesInPairs.swapPairs(node));
    }

    @Test
    public void extremes() {
        ListNode oneElement = ListNode.buildList(1);
        assertSame(oneElement, swapNodesInPairs.swapPairs(oneElement));

        ListNode twoElements = ListNode.buildList(1, 2);
        assertEquals(ListNode.buildList(2, 1), swapNodesInPairs.swapPairs(twoElements));

        assertNull(swapNodesInPairs.swapPairs(null));
    }
}