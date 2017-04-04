package com.leetcode.problems.algorytms;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {
    private AddTwoNumbers.ListNode buildList(int... values) {
        AddTwoNumbers.ListNode firstNode = null;
        AddTwoNumbers.ListNode curNode = null;

        for (final int value : values) {
            if (curNode == null) {
                curNode = new AddTwoNumbers.ListNode(value);
            } else {
                curNode.next = new AddTwoNumbers.ListNode(value);
                curNode = curNode.next;
            }
            if (firstNode == null) {
                firstNode = curNode;
            }
        }

        return firstNode;
    }

    private void checkNumbers(AddTwoNumbers.ListNode first, AddTwoNumbers.ListNode second) {
        final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        final int firstInt = Integer.parseInt(first.toDigit());
        final int secondInt = Integer.parseInt(second.toDigit());
        final int actual =  Integer.parseInt(addTwoNumbers.addTwoNumbers(first, second).toDigit());
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
        checkNumbers(buildList(2, 4, 3), buildList(7, 1, 3 ,5));
    }

    @Test
    public void extraDigit() throws Exception {
        checkNumbers(buildList(2, 4, 3), buildList(7, 5, 7));
        checkNumbers(buildList(5, 5, 6), buildList(4, 6, 7));
    }
}