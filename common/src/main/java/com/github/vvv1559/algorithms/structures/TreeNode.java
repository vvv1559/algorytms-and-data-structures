package com.github.vvv1559.algorithms.structures;

import java.util.Objects;

public class TreeNode {

    public final int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode fromArray(Integer... values) {
        return treeNode(values, 0);
    }

    private static TreeNode treeNode(Integer[] values, int nodeIndex) {
        if (nodeIndex >= values.length) {
            return null;
        }

        Integer val = values[nodeIndex];
        if (val == null) {
            return null;
        }

        TreeNode node = new TreeNode(val);
        node.left = treeNode(values, 2 * nodeIndex + 1);
        node.right = treeNode(values, 2 * nodeIndex + 2);
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
