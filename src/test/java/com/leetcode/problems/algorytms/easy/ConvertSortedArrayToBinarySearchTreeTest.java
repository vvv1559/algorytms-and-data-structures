package com.leetcode.problems.algorytms.easy;

import com.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void sortedArrayToBST() {
        ConvertSortedArrayToBinarySearchTree searchTree = new ConvertSortedArrayToBinarySearchTree();
        TreeNode expected = TreeNode.fromArray(0, -10, 5, null, -3, null, 9);
        assertEquals(expected, searchTree.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));

    }
}