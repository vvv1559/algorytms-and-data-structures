package com.leetcode.problems.algorytms.medium;

import com.common.ListNode;
import org.junit.Assert;
import org.junit.Test;


public class SwapNodesInPairsTest {
    private SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

    @Test
    public void examples() throws Exception {
        ListNode node = ListNode.buildList(1, 2, 3, 4);
        ListNode expected = ListNode.buildList(2, 1, 4, 3);
        Assert.assertEquals(expected, swapNodesInPairs.swapPairs(node));
    }

    @Test
    public void oddLength() throws Exception {
        ListNode node = ListNode.buildList(1, 2, 3);
        ListNode expected = ListNode.buildList(2, 1, 3);
        Assert.assertEquals(expected, swapNodesInPairs.swapPairs(node));
    }

    @Test
    public void extremes() throws Exception {
        ListNode oneElement = ListNode.buildList(1);
        Assert.assertTrue(oneElement == swapNodesInPairs.swapPairs(oneElement));

        ListNode twoElements = ListNode.buildList(1, 2);
        Assert.assertEquals(ListNode.buildList(2, 1), swapNodesInPairs.swapPairs(twoElements));

        Assert.assertNull(swapNodesInPairs.swapPairs(null));
    }
}