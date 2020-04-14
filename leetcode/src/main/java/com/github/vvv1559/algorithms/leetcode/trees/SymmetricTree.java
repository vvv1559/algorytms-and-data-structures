package com.github.vvv1559.algorithms.leetcode.trees;

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;
import com.github.vvv1559.algorithms.structures.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

@Difficulty(Level.EASY)
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
