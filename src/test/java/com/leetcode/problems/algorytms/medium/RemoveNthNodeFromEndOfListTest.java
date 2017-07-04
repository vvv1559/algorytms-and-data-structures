package com.leetcode.problems.algorytms.medium;

import com.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthNodeFromEndOfListTest {
    private final RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

    @Test
    public void removeNthFromEnd() throws Exception {
        ListNode listNode = ListNode.buildList(1, 2, 3, 4, 5);
        ListNode expected = ListNode.buildList(1, 2, 3, 5);
        Assert.assertEquals(removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 2), expected);
    }

    @Test
    public void removeFirst() throws Exception {
        ListNode listNode = ListNode.buildList(1, 2, 3, 4, 5);
        ListNode expected = ListNode.buildList(2, 3, 4, 5);
        Assert.assertEquals(removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 5), expected);
    }

    @Test
    public void removeLast() throws Exception {
        ListNode listNode = ListNode.buildList(1, 2, 3, 4, 5);
        ListNode expected = ListNode.buildList(1, 2, 3, 4);
        Assert.assertEquals(removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 1), expected);
    }


    @Test
    public void removeAll() throws Exception {
        Assert.assertNull(removeNthNodeFromEndOfList.removeNthFromEnd(new ListNode(1), 1));
    }

}