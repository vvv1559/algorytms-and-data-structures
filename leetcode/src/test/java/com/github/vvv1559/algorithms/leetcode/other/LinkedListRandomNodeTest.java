package com.github.vvv1559.algorithms.leetcode.other;

import com.github.vvv1559.algorithms.structures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListRandomNodeTest {

    @Test
    void getRandom() {
        ListNode head = ListNode.buildList(1, 2, 3);
        LinkedListRandomNode linkedListRandomNode = new LinkedListRandomNode(head);
        for (int i = 0; i < 10; i++) {
            int random = linkedListRandomNode.getRandom();
            assertTrue(random == 1 || random == 2 || random == 3);
        }
    }
}