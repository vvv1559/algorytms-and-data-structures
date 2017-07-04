package com.leetcode.problems.algorytms.medium;

import com.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {
    private ListNode buildList(int... values) {
        ListNode firstNode = null;
        ListNode curNode = null;

        for (final int value : values) {
            if (curNode == null) {
                curNode = new ListNode(value);
            } else {
                curNode.next = new ListNode(value);
                curNode = curNode.next;
            }
            if (firstNode == null) {
                firstNode = curNode;
            }
        }

        return firstNode;
    }

    private static String toDigit(ListNode listNode) {
        return  "" + (listNode.next == null ? listNode.val : toDigit(listNode.next) + listNode.val);
    }

    private void checkNumbers(ListNode first, ListNode second) {
        final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        final int firstInt = Integer.parseInt(toDigit(first));
        final int secondInt = Integer.parseInt(toDigit(second));
        final int actual = Integer.parseInt(toDigit(addTwoNumbers.addTwoNumbers(first, second)));
        Assert.assertEquals(firstInt + " + " + secondInt + " = ", firstInt + secondInt, actual);
    }

    @Test
    public void fromSample() throws Exception {
        checkNumbers(buildList(2, 4, 3), buildList(5, 6, 4));
    }

    @Test
    public void withOneZero() throws Exception {
        checkNumbers(buildList(0), buildList(5, 6, 4));
        checkNumbers(buildList(2, 4, 3), buildList(0));
    }

    @Test
    public void differentLength() throws Exception {
        checkNumbers(buildList(2, 4, 3), buildList(7, 1));
        checkNumbers(buildList(2, 4, 3), buildList(7, 1, 3, 5));
    }

    @Test
    public void extraDigit() throws Exception {
        checkNumbers(buildList(2, 4, 3), buildList(7, 5, 7));
        checkNumbers(buildList(5, 5, 6), buildList(4, 6, 7));
    }
}