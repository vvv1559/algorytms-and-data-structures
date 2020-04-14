package com.github.vvv1559.algorithms.leetcode.lists;

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;
import com.github.vvv1559.algorithms.structures.ListNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


/*
 * Original text: https://leetcode.com/problems/merge-k-sorted-lists/#/description
 *
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *
 * */

@Difficulty(Level.HARD)
class MergeKSortedLists {

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
