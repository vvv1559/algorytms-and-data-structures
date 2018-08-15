package com.leetcode.problems.algorytms.easy;

import com.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBinaryTreeTest {

    @Test
    public void isBalanced() {
        BalancedBinaryTree tree = new BalancedBinaryTree();
        assertTrue(tree.isBalanced(TreeNode.fromArray(3, 9, 20, null, null, 15, 7)));
        assertTrue(tree.isBalanced(TreeNode.fromArray(3, 9, 20, null, null, 15, 7)));
        assertFalse(tree.isBalanced(TreeNode.fromArray(1, 2, 2, 3, 3, null, null, 4, 4)));
    }
}