package com.leetcode.problems.algorytms.easy;

import com.common.ListNode;


/*
 * Original text: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * */

class RemoveDuplicatesFromSortedList {

    ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode(Integer.MIN_VALUE);
        result.next = head;
        ListNode currentNode = result;

        while (currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return result.next;
    }
}
