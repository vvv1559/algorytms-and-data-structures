package com.leetcode.problems.algorytms.medium;

import com.Difficulty;
import com.SolutionComplexity;
import com.common.ListNode;

import static com.Difficulty.Level.MEDIUM;

/*
* Original text: https://leetcode.com/problems/remove-nth-node-from-end-of-list/#/description
*
* Given a linked list, remove the nth node from the end of list and return its head.
*
* For example,
*
* Given linked list: 1->2->3->4->5, and n = 2.
*
* After removing the second node from the end, the linked list becomes 1->2->3->5.
*
* Note:
* Given n will always be valid.
* Try to do this in one pass.
*
* */

@Difficulty(MEDIUM)
class RemoveNthNodeFromEndOfList {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(1)")
    ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode resultHead = new ListNode(-1);
        resultHead.next = head;

        ListNode windowStart = resultHead, windowEnd = resultHead;

        while (n-- > 0) {
            windowEnd = windowEnd.next;
        }

        while ((windowEnd = windowEnd.next) != null) {
            windowStart = windowStart.next;

        }

        windowStart.next = windowStart.next.next;

        return resultHead.next;
    }
}
