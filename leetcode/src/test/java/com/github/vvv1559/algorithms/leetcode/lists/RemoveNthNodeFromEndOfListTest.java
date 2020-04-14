package com.github.vvv1559.algorithms.leetcode.lists;

import com.github.vvv1559.algorithms.structures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveNthNodeFromEndOfListTest {
    private final RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

    @Test
    public void removeNthFromEnd() {
        ListNode listNode = ListNode.buildList(1, 2, 3, 4, 5);
        ListNode expected = ListNode.buildList(1, 2, 3, 5);
        assertEquals(removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 2), expected);
    }

    @Test
    public void removeFirst() {
        ListNode listNode = ListNode.buildList(1, 2, 3, 4, 5);
        ListNode expected = ListNode.buildList(2, 3, 4, 5);
        assertEquals(removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 5), expected);
    }

    @Test
    public void removeLast() {
        ListNode listNode = ListNode.buildList(1, 2, 3, 4, 5);
        ListNode expected = ListNode.buildList(1, 2, 3, 4);
        assertEquals(removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 1), expected);
    }


    @Test
    public void removeAll() {
        assertNull(removeNthNodeFromEndOfList.removeNthFromEnd(new ListNode(1), 1));
    }

}