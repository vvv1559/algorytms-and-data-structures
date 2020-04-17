package com.github.vvv1559.algorithms.leetcode.lists;

/*
 * Odd Even Linked List
 *
 * Original text: https://leetcode.com/problems/odd-even-linked-list/
 *
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking
 * about the node number and not the value in the nodes.
 *
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 *
 * Example 1:
 *
 * Input: 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;NULL
 * Output: 1-&gt;3-&gt;5-&gt;2-&gt;4-&gt;NULL
 *
 *
 * Example 2:
 *
 * Input: 2-&gt;1-&gt;3-&gt;5-&gt;6-&gt;4-&gt;7-&gt;NULL
 * Output: 2-&gt;3-&gt;6-&gt;7-&gt;1-&gt;5-&gt;4-&gt;NULL
 *
 *
 * Note:
 *
 * 	The relative order inside both the even and odd groups should remain as it was in the input.
 * 	The first node is considered odd, the second node even and so on ...
 *
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;
import com.github.vvv1559.algorithms.structures.ListNode;

@Difficulty(Level.MEDIUM)
class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddListResult = new ListNode(-1);
        ListNode result = new ListNode(-1);

        ListNode oddListHead = oddListResult;
        ListNode evenListHead = result;

        boolean isOdd = false;
        while (head != null) {
            if (isOdd) {
                oddListHead.next = head;
                oddListHead = oddListHead.next;
            } else {
                evenListHead.next = head;
                evenListHead = evenListHead.next;
            }
            head = head.next;
            isOdd = !isOdd;
        }
        oddListHead.next = null;
        evenListHead.next = oddListResult.next;

        return result.next;
    }
}