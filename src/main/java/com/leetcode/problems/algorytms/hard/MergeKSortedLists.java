package com.leetcode.problems.algorytms.hard;

import com.Difficulty;
import com.SolutionComplexity;
import com.common.ListNode;
import com.leetcode.problems.algorytms.easy.MergeTwoSortedLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

import static com.Difficulty.Level.HARD;

/*
* Original text: https://leetcode.com/problems/merge-k-sorted-lists/#/description
*
* Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
*
* */

@Difficulty(HARD)
class MergeKSortedLists {

    @SolutionComplexity(complexity = "O(n*m)", extraMemory = "O(n)")
    public ListNode mergeKListsHeap(ListNode[] lists) {
        if (lists == null) return null;

        // Solution must be based on Heap sort. PriorityQueue in java has heap sort realisation
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(i -> i.val));
        for (ListNode listNode : lists) {
            if (listNode != null) {
                queue.add(listNode);
            }
        }

        ListNode result = new ListNode(-1);
        ListNode currentNode = result;

        while (!queue.isEmpty()) {
            currentNode.next = queue.poll();
            currentNode = currentNode.next;

            if (currentNode.next != null) {
                queue.add(currentNode.next);
            }
        }

        return result.next;
    }

    @SolutionComplexity(complexity = "O(n*m)", extraMemory = "O(n)")
    ListNode mergeKListsRecurse(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        if (lists.length == 1) {
            return lists[0];
        }

        int half = lists.length / 2;
        ListNode left = mergeKListsRecurse(Arrays.copyOfRange(lists, 0, half));
        ListNode right = mergeKListsRecurse(Arrays.copyOfRange(lists, half, lists.length));
        return mergeTwoSortedLists.mergeTwoLists(left, right);
    }
}
