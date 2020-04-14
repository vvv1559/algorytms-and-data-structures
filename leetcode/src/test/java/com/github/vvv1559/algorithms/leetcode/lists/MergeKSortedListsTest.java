package com.github.vvv1559.algorithms.leetcode.lists;

import com.github.vvv1559.algorithms.structures.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeKSortedListsTest {
    private final MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
    private ListNode[] four, three, two, one;
    private ListNode fourExpected, threeExpected, twoExpected, oneExpected;

    @BeforeEach
    public void setUp() {
        ListNode odd = ListNode.buildList(1, 3, 5, 7);
        ListNode even = ListNode.buildList(2, 4, 6);

        four = new ListNode[]{new ListNode(even), new ListNode(odd), new ListNode(even), new ListNode(odd)};
        three = new ListNode[]{new ListNode(even), new ListNode(odd), new ListNode(even)};
        two = new ListNode[]{new ListNode(even), new ListNode(odd)};
        one = new ListNode[]{new ListNode(even)};

        fourExpected = ListNode.buildList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7);
        threeExpected = ListNode.buildList(1, 2, 2, 3, 4, 4, 5, 6, 6, 7);
        twoExpected = ListNode.buildList(1, 2, 3, 4, 5, 6, 7);
        oneExpected = ListNode.buildList(2, 4, 6);
    }

    @Test
    public void mergeKListsHeap() {
        check(mergeKSortedLists::mergeKListsHeap);
    }

    @Test
    public void mergeKListsRecurse() {
        check(mergeKSortedLists::mergeKListsRecurse);
    }

    private void check(Function<ListNode[], ListNode> testMethod) {
        assertEquals(fourExpected, testMethod.apply(four));
        assertEquals(threeExpected, testMethod.apply(three));
        assertEquals(twoExpected, testMethod.apply(two));
        assertEquals(oneExpected, testMethod.apply(one));
        assertNull(testMethod.apply(null));
    }

}