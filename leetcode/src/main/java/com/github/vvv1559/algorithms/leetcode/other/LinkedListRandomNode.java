package com.github.vvv1559.algorithms.leetcode.other;

/*
 * Linked List Random Node
 *
 * Original text: https://leetcode.com/problems/linked-list-random-node/
 *
 * Given a singly linked list, return a random node's value from the linked list. Each node must have the same
 * probability of being chosen.
 *
 * Follow up:
 * What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without
 * using extra space?
 *
 *
 * Example:
 *
 * // Init a singly linked list [1,2,3].
 * ListNode head = new ListNode(1);
 * head.next = new ListNode(2);
 * head.next.next = new ListNode(3);
 * Solution solution = new Solution(head);
 * // getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
 * solution.getRandom();
 *
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;
import com.github.vvv1559.algorithms.structures.ListNode;

import java.util.Random;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
@Difficulty(Level.MEDIUM)
class LinkedListRandomNode {

    private final ListNode head;

    private final Random random;

    /**
     * @param head The linked list's head.
     *             Note that the head is guaranteed to be not null, so it contains at least one node.
     */
    public LinkedListRandomNode(ListNode head) {
        this.head = head;
        this.random = new Random();
    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        ListNode current = head;
        ListNode result = head;
        int count = 1;
        int r;
        while (current != null) {
            r = random.nextInt(count);
            if (r == 0) {
                result = current;
            }

            current = current.next;
            count++;
        }

        return result.val;
    }
}

/**
 * Your LinkedListRandomNode object will be instantiated and called as such:
 * LinkedListRandomNode obj = new LinkedListRandomNode(head);
 * int param_1 = obj.getRandom();
 */