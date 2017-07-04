package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.SolutionComplexity;
import com.common.ListNode;

import static com.Difficulty.Level.EASY;

/*
* Original text: https://leetcode.com/problems/merge-two-sorted-lists/#/description
*
* Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes
* of the first two lists.
*
* */

@Difficulty(EASY)
class MergeTwoSortedLists {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(1)")
    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode currentNode = null;
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

            if (head == null) {
                head = nextNode;
                currentNode = nextNode;
            } else {
                currentNode.next = nextNode;
                currentNode = nextNode;
            }
        }

        return head;
    }
}