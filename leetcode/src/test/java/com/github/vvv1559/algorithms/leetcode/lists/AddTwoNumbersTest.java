package com.github.vvv1559.algorithms.leetcode.lists;

import com.github.vvv1559.algorithms.structures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {
    private static String toDigit(ListNode listNode) {
        return "" + (listNode.next == null ? listNode.val : toDigit(listNode.next) + listNode.val);
    }

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

    private void checkNumbers(ListNode first, ListNode second) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        int firstInt = Integer.parseInt(toDigit(first));
        int secondInt = Integer.parseInt(toDigit(second));
        int actual = Integer.parseInt(toDigit(addTwoNumbers.addTwoNumbers(first, second)));
        assertEquals(firstInt + secondInt, actual, firstInt + " + " + secondInt + " = ");
    }

    @Test
    public void fromSample() {
        checkNumbers(buildList(2, 4, 3), buildList(5, 6, 4));
    }

    @Test
    public void withOneZero() {
        checkNumbers(buildList(0), buildList(5, 6, 4));
        checkNumbers(buildList(2, 4, 3), buildList(0));
    }

    @Test
    public void differentLength() {
        checkNumbers(buildList(2, 4, 3), buildList(7, 1));
        checkNumbers(buildList(2, 4, 3), buildList(7, 1, 3, 5));
    }

    @Test
    public void extraDigit() {
        checkNumbers(buildList(2, 4, 3), buildList(7, 5, 7));
        checkNumbers(buildList(5, 5, 6), buildList(4, 6, 7));
    }
}