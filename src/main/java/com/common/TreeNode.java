package com.common;

import java.util.Objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode fromArray(Integer... vals) {
        return treeNode(vals, 0);
    }

    private static TreeNode treeNode(Integer[] vals, int nodeIndex) {
        if (nodeIndex >= vals.length) {
            return null;
        }

        Integer val = vals[nodeIndex];
        if (val == null) {
            return null;
        }

        TreeNode node = new TreeNode(val);
        node.left = treeNode(vals, 2 * nodeIndex + 1);
        node.right = treeNode(vals, 2 * nodeIndex + 2);
        return node;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode node = (TreeNode) o;
        return val == node.val &&
                Objects.equals(left, node.left) &&
                Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
