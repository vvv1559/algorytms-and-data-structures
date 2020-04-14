package com.github.vvv1559.algorithms.leetcode.trees;

import com.github.vvv1559.algorithms.structures.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void sortedArrayToBST() {
        ConvertSortedArrayToBinarySearchTree searchTree = new ConvertSortedArrayToBinarySearchTree();
        TreeNode expected = TreeNode.fromArray(0, -10, 5, null, -3, null, 9);
        assertEquals(expected, searchTree.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));

    }
}