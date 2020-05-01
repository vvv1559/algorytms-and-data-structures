package com.github.vvv1559.algorithms.leetcode.lists;

/*
 * Design Linked List
 *
 * Original text: https://leetcode.com/problems/design-linked-list/
 *
 * Design your implementation of the linked list. You can choose to use the singly linked list or the doubly linked list.
 * A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and
 * next is a pointer/reference to the next node. If you want to use the doubly linked list,you will need one more attribute
 * prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.
 * Implement these functions in your linked list class:	get(index) : Get the value of the index-th node in the linked
 * list. If the index is invalid, return -1.	addAtHead(val) : Add a node of value val before the first element of the
 * linked list. After the insertion, the new node will be the first node of the linked list.	addAtTail(val) : Append a
 * node of value valto the last element of the linked list.	addAtIndex(index, val) : Add a node of value val before the
 * index-th node in the linked list.If index equals to the length of linked list, the node will be appended to the end of
 * linked list. If index is greater than the length, the node will not be inserted.	deleteAtIndex(index) : Delete the
 * index-thn ode in the linked list, if the index is valid.
 *
 * Example:Input:
 *
 * uot;addAtIndex&quot;,&quot;get&quot;,&quot;deleteAtIndex&quot;,&quot;get&quot;][[],[1],[3],[1,2],[1],[1],[1]]Output:
 * [null,null,null,null,2,null,3]Explanation:MyLinkedList linkedList = new MyLinkedList(); // Initialize empty
 * Linked List linked List.addAtHead(1);linkedList.addAtTail(3);linkedList.addAtIndex(1, 2);  // linked list becomes
 * 1-&gt;2-&gt;3linkedList.get(1);            // returns 2linkedList.deleteAtIndex(1);  // now the linked list is
 * 1-&gt;3linkedList.get(1);         // returns 3
 *
 * Constraints:	0 &lt;= index,val &lt;= 1000	Please do not use the built-in LinkedList library.	At most 2000calls will
 * be made toget,addAtHead,addAtTail, addAtIndex anddeleteAtIndex.
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class MyLinkedList {

    private Node head;

    private Node tail;

    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index >= size || index < 0) {
            return -1;
        }

        return getNode(index).value;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        if (head != null) {
            newHead.next = head;
        }

        if (tail == null) {
            tail = newHead;
        }

        head = newHead;
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }

        Node nextTail = new Node(val);

        if (tail != null) {
            tail.next = nextTail;
        }

        tail = nextTail;

        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node prevNode = getNode(index - 1);
        Node nextNode = prevNode.next;

        Node newNode = new Node(val);
        prevNode.next = newNode;
        newNode.next = nextNode;
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (size == 0 || index < 0 || index >= size) {
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
        } else if (index == 0) {
            head = head.next;
        } else {
            Node prevNode = getNode(index - 1);
            Node nextNode = prevNode.next.next;
            prevNode.next = nextNode;
            if (nextNode == null) { //tail
                tail = prevNode;
            }
        }

        size--;
    }

    private Node getNode(int index) {
        Node result = head;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result;
    }

    private static class Node {

        private final int value;

        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }
}