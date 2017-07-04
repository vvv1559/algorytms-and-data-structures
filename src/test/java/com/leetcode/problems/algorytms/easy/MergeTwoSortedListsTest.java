package com.leetcode.problems.algorytms.easy;

import com.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
    @Test
    public void mergeTwoLists() throws Exception {
        ListNode fst = ListNode.buildList(1, 3, 5, 7);
        ListNode snd = ListNode.buildList(2, 4, 6);
        ListNode expected = ListNode.buildList(1, 2, 3, 4, 5, 6, 7);
        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(fst, snd), expected);
        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(snd, fst), expected);

    }

    @Test
    public void checkEmpty() throws Exception {
        ListNode fst = ListNode.buildList(1, 3, 5, 7);
        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(fst, null), fst);
        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(null, fst), fst);
        Assert.assertNull(mergeTwoSortedLists.mergeTwoLists(null, null));

    }
}