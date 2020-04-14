package com.github.vvv1559.algorithms.structures;

import java.util.Objects;

public class ListNode {
    public final int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(ListNode copyNode) {
        val = copyNode.val;

        if (copyNode.next != null) {
            next = new ListNode(copyNode.next);
        }
    }

    public static ListNode buildList(int... values) {
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


    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
