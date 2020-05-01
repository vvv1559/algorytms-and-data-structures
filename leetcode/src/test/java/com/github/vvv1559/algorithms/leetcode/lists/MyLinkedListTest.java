package com.github.vvv1559.algorithms.leetcode.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLinkedListTest {

    @Test
    void get() {
    }

    @Test
    void addAtHeadNoHead() {
        MyLinkedList myLinkedList = new MyLinkedList();
        assertEquals(-1, myLinkedList.get(0));

        myLinkedList.addAtHead(42);
        assertEquals(42, myLinkedList.get(0));
        assertEquals(-1, myLinkedList.get(1));
    }

    @Test
    void addAtHeadByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        assertEquals(-1, myLinkedList.get(0));

        myLinkedList.addAtIndex(0, 42);
        assertEquals(42, myLinkedList.get(0));
        assertEquals(-1, myLinkedList.get(1));
    }

    @Test
    void addAtHeadTwice() {
        MyLinkedList myLinkedList = new MyLinkedList();
        assertEquals(-1, myLinkedList.get(0));

        myLinkedList.addAtHead(42);
        assertEquals(42, myLinkedList.get(0));

        myLinkedList.addAtHead(24);
        assertEquals(24, myLinkedList.get(0));
        assertEquals(42, myLinkedList.get(1));
    }

    @Test
    void addAtTailEmptyList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        assertEquals(-1, myLinkedList.get(0));

        myLinkedList.addAtTail(42);
        assertEquals(42, myLinkedList.get(0));
    }

    @Test
    void addAtTailTwice() {
        MyLinkedList myLinkedList = new MyLinkedList();
        assertEquals(-1, myLinkedList.get(0));

        myLinkedList.addAtTail(42);
        assertEquals(42, myLinkedList.get(0));
        assertEquals(-1, myLinkedList.get(1));

        myLinkedList.addAtTail(24);
        assertEquals(42, myLinkedList.get(0));
        assertEquals(24, myLinkedList.get(1));
    }


    @Test
    void addAtIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(10);
        myLinkedList.addAtTail(20);
        myLinkedList.addAtTail(30);

        myLinkedList.addAtIndex(1, 15);
        assertEquals(10, myLinkedList.get(0));
        assertEquals(15, myLinkedList.get(1));
        assertEquals(20, myLinkedList.get(2));
        assertEquals(30, myLinkedList.get(3));
        assertEquals(-1, myLinkedList.get(4));

    }

    @Test
    void deleteAtIndexEmpty() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.deleteAtIndex(0);
    }

    @Test
    void deleteAtIndexOnlyOneElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(42);

        assertEquals(42, myLinkedList.get(0));

        myLinkedList.deleteAtIndex(0);
        assertEquals(-1, myLinkedList.get(0));
    }
}