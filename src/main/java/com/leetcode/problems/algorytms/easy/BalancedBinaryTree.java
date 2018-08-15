package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.common.TreeNode;

import static com.Difficulty.Level.EASY;


@Difficulty(EASY)
class BalancedBinaryTree {

    boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1) {
            return false;
        }

        return Math.abs(leftHeight - rightHeight) < 2;
    }

    private Integer height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
