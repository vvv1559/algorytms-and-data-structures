package com.github.vvv1559.algorithms.leetcode.lists;

import com.github.vvv1559.algorithms.structures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveDuplicatesFromSortedListTest {
    private final RemoveDuplicatesFromSortedList duplicatesRemover = new RemoveDuplicatesFromSortedList();

    @Test
    public void examples() {
        assertEquals(ListNode.buildList(1, 2), duplicatesRemover.deleteDuplicates(ListNode.buildList(1, 1, 2)));
        assertEquals(ListNode.buildList(1, 2, 3), duplicatesRemover.deleteDuplicates(ListNode.buildList(1, 1, 2, 3, 3)));
    }

    @Test
    public void fromTestSystem() {
        assertEquals(ListNode.buildList(0), duplicatesRemover.deleteDuplicates(ListNode.buildList(0, 0, 0, 0, 0)));

    }

    @Test
    public void extremes() {
        assertNull(duplicatesRemover.deleteDuplicates(null));
        assertEquals(ListNode.buildList(1), duplicatesRemover.deleteDuplicates(ListNode.buildList(1, 1, 1, 1, 1)));
    }
}