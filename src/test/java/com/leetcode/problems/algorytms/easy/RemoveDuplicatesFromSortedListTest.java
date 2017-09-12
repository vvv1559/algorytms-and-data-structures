package com.leetcode.problems.algorytms.easy;

import com.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveDuplicatesFromSortedListTest {
    private final RemoveDuplicatesFromSortedList duplicatesRemover = new RemoveDuplicatesFromSortedList();

    @Test
    public void examples() throws Exception {
        assertEquals(ListNode.buildList(1, 2), duplicatesRemover.deleteDuplicates(ListNode.buildList(1, 1, 2)));
        assertEquals(ListNode.buildList(1, 2, 3), duplicatesRemover.deleteDuplicates(ListNode.buildList(1, 1, 2, 3, 3)));
    }

    @Test
    public void fromTestSystem() throws Exception {
        assertEquals(ListNode.buildList(0), duplicatesRemover.deleteDuplicates(ListNode.buildList(0, 0, 0, 0, 0)));

    }

    @Test
    public void extremes() throws Exception {
        assertNull(duplicatesRemover.deleteDuplicates(null));
        assertEquals(ListNode.buildList(1), duplicatesRemover.deleteDuplicates(ListNode.buildList(1, 1, 1, 1, 1)));
    }
}