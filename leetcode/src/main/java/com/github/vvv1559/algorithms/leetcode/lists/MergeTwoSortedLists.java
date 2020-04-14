package com.github.vvv1559.algorithms.leetcode.lists;

/*
 * Original text: https://leetcode.com/problems/merge-two-sorted-lists/#/description
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes
 * of the first two lists.
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;
import com.github.vvv1559.algorithms.structures.ListNode;

@Difficulty(Level.EASY)
class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(-1);
        ListNode currentNode = head;
        while (l1 != null || l2 != null) {
            ListNode nextNode;
            if (l2 == null || l1 != null && l1.val < l2.val) {
                nextNode = l1;
                l1 = l1.next;
            } else {
                nextNode = l2;
                l2 = l2.next;
            }

            nextNode = new ListNode(nextNode.val);
            currentNode.next = nextNode;
            currentNode = nextNode;
        }

        return head.next;
    }
}