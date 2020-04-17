package com.github.vvv1559.algorithms.leetcode.lists;

import com.github.vvv1559.algorithms.structures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class OddEvenLinkedListTest {

    @Test
    void oddEvenList() {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        assertEquals(ListNode.buildList(1, 3, 5, 2, 4), oddEvenLinkedList.oddEvenList(ListNode.buildList(1, 2, 3, 4, 5)));
        assertEquals(ListNode.buildList(1, 5, 2, 4), oddEvenLinkedList.oddEvenList(ListNode.buildList(1, 2, 5, 4)));
        assertEquals(ListNode.buildList(2, 3, 6, 7, 1, 5, 4), oddEvenLinkedList.oddEvenList(ListNode.buildList(2, 1, 3, 5, 6, 4, 7)));
        assertEquals(ListNode.buildList(5), oddEvenLinkedList.oddEvenList(ListNode.buildList(5)));
        assertNull(oddEvenLinkedList.oddEvenList(null));
    }
}