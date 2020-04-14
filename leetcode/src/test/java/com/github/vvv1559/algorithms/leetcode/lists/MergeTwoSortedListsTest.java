package com.github.vvv1559.algorithms.leetcode.lists;

import com.github.vvv1559.algorithms.structures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    public void mergeTwoLists() {
        ListNode fst = ListNode.buildList(1, 3, 5, 7);
        ListNode snd = ListNode.buildList(2, 4, 6);
        ListNode expected = ListNode.buildList(1, 2, 3, 4, 5, 6, 7);
        assertEquals(mergeTwoSortedLists.mergeTwoLists(fst, snd), expected);
        assertEquals(mergeTwoSortedLists.mergeTwoLists(snd, fst), expected);

    }

    @Test
    public void checkEmpty() {
        ListNode fst = ListNode.buildList(1, 3, 5, 7);
        assertEquals(mergeTwoSortedLists.mergeTwoLists(fst, null), fst);
        assertEquals(mergeTwoSortedLists.mergeTwoLists(null, fst), fst);
        assertNull(mergeTwoSortedLists.mergeTwoLists(null, null));

    }
}