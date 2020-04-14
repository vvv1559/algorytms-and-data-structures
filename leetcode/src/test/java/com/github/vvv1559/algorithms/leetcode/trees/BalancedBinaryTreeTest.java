package com.github.vvv1559.algorithms.leetcode.trees;

import com.github.vvv1559.algorithms.structures.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedBinaryTreeTest {

    @Test
    public void isBalanced() {
        BalancedBinaryTree tree = new BalancedBinaryTree();
        assertTrue(tree.isBalanced(TreeNode.fromArray(3, 9, 20, null, null, 15, 7)));
        assertTrue(tree.isBalanced(TreeNode.fromArray(3, 9, 20, null, null, 15, 7)));
        assertFalse(tree.isBalanced(TreeNode.fromArray(1, 2, 2, 3, 3, null, null, 4, 4)));
    }
}