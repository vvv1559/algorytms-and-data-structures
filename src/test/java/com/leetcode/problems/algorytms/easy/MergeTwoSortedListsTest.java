package com.leetcode.problems.algorytms.easy;

import com.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {
    final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    private ListNode buildList(int... values) {
        ListNode result = null;
        ListNode currentNode = null;
        for (int i : values) {
            ListNode nextNode = new ListNode(i);
            result = result == null ? nextNode : result;

            if (currentNode == null) {
                currentNode = nextNode;
            } else {
                currentNode.next = nextNode;
                currentNode = nextNode;
            }
        }

        return result;
    }

    @Test
    public void mergeTwoLists() throws Exception {
        ListNode fst = buildList(1, 3, 5, 7);
        ListNode snd = buildList(2, 4, 6);
        ListNode expected = buildList(1, 2, 3, 4, 5, 6, 7);
        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(fst, snd), expected);
        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(snd, fst), expected);

    }

    @Test
    public void checkEmpty() throws Exception {
        ListNode fst = buildList(1, 3, 5, 7);
        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(fst, null), fst);
        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(null, fst), fst);
        Assert.assertNull(mergeTwoSortedLists.mergeTwoLists(null, null));

    }
}