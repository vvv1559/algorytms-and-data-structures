package com.leetcode.problems.algorytms.medium;

import com.Difficulty;
import com.SolutionComplexity;
import com.common.ListNode;

import static com.Difficulty.Level.MEDIUM;

/*
* Original text: https://leetcode.com/problems/add-two-numbers/#/description
*
* You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
*
* You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*
* Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
* Output: 7 -> 0 -> 8
*
* */

@Difficulty(MEDIUM)
class AddTwoNumbers {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(1)")
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.next == null && l1.val == 0) {
            return l2;
        } else if (l2.next == null && l2.val == 0) {
            return l1;
        }
        ListNode first = l1;
        ListNode second = l2;
        ListNode result = null;
        ListNode curNode = null;
        int nextDigitExtra = 0;
        while (first != null || second != null) {

            final int sum;
            if (first == null) {
                sum = second.val + nextDigitExtra;
                second = second.next;
            } else if (second == null) {
                sum = first.val + nextDigitExtra;
                first = first.next;
            } else {
                sum = first.val + second.val + nextDigitExtra;
                first = first.next;
                second = second.next;
            }

            nextDigitExtra = sum / 10;
            final ListNode nextNode = new ListNode(sum - nextDigitExtra * 10);
            if (curNode == null) {
                result = nextNode;
            } else {
                curNode.next = nextNode;
            }
            curNode = nextNode;
        }

        if (nextDigitExtra != 0) {
            curNode.next = new ListNode(nextDigitExtra);
        }

        return result;
    }
}
