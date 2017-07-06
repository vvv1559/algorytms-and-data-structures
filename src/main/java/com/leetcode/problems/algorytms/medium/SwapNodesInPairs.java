package com.leetcode.problems.algorytms.medium;

import com.Difficulty;
import com.SolutionComplexity;
import com.common.ListNode;

import static com.Difficulty.Level.MEDIUM;

/*
* Given a linked list, swap every two adjacent nodes and return its head.
*
* For example,
* Given 1->2->3->4, you should return the list as 2->1->4->3.
*
* Your algorithm should use only constant space.
* You may not modify the values in the list, only nodes itself can be changed.
*
* */

@Difficulty(MEDIUM)
class SwapNodesInPairs {

    @SolutionComplexity(complexity = "O(n)", extraMemory = "O(1)")
    ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode result = new ListNode(-1);
        result.next = head;
        ListNode currentNode = result;

        ListNode fst, snd;
        while ((fst = currentNode.next) != null && (snd = currentNode.next.next) != null) {
            currentNode.next = snd;
            fst.next = snd.next;
            snd.next = fst;

            currentNode = fst;
        }

        return result.next;
    }
}
