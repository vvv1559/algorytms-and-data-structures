package com.leetcode.problems.algorytms.easy;

import com.Difficulty;
import com.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

import static com.Difficulty.Level.EASY;


@Difficulty(EASY)
class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> data = new LinkedList<>();
        data.add(root.left);
        data.add(root.right);

        while (!data.isEmpty()) {
            TreeNode fst = data.poll();
            TreeNode snd = data.poll();
            if (fst == null && snd == null) continue;
            else if (fst == null || snd == null || fst.val != snd.val) return false;
            data.add(fst.left);
            data.add(snd.right);
            data.add(fst.right);
            data.add(snd.left);
        }
        return true;
    }
}
