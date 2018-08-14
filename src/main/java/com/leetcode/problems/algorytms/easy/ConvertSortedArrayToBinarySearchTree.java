package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.common.TreeNode;

import static com.Difficulty.Level.EASY;


@Difficulty(EASY)
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
