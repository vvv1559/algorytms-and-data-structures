package com.github.vvv1559.algorithms.leetcode.trees;

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;
import com.github.vvv1559.algorithms.structures.TreeNode;

@Difficulty(Level.EASY)
class ConvertSortedArrayToBinarySearchTree {

    TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return buildNode(nums, 0, nums.length - 1);
    }

    private TreeNode buildNode(int[] nums, int start, int end) {
        if (start > end) return null;

        int middle = (end + start) / 2;
        TreeNode result = new TreeNode(nums[middle]);
        result.left = buildNode(nums, start, middle - 1);
        result.right = buildNode(nums, middle + 1, end);

        return result;
    }
}
