package com.leetcode.problems.algorytms.hard;

import com.common.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.function.Function;

public class MergeKSortedListsTest {
    private ListNode[] four, three, two, one;
    private ListNode fourExpected, threeExpected, twoExpected, oneExpected;
    private MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();

    @Before
    public void setUp() throws Exception {
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
    public void mergeKListsHeap() throws Exception {
        check(mergeKSortedLists::mergeKListsHeap);
    }

    @Test
    public void mergeKListsRecurse() throws Exception {
        check(mergeKSortedLists::mergeKListsRecurse);
    }

    private void check(Function<ListNode[], ListNode> testMethod) {
        Assert.assertEquals(fourExpected, testMethod.apply(four));
        Assert.assertEquals(threeExpected, testMethod.apply(three));
        Assert.assertEquals(twoExpected, testMethod.apply(two));
        Assert.assertEquals(oneExpected, testMethod.apply(one));
        Assert.assertNull(testMethod.apply(null));
    }

}