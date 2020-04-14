package com.hackerrank.coding.interview;

class IsBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    private boolean checkNode(Node node, int min, int max) {
        boolean nodeCorrect = false;

        if (node != null) {
            final Node leftNode = node.left;

            final boolean leftCorrect;
            if (leftNode != null) {
                final int leftNodeData = leftNode.data;
                leftCorrect = (min == -1 || leftNodeData > min)
                        && (max == -1 || leftNodeData < max)
                        && leftNodeData < node.data
                        && checkNode(leftNode, min, node.data);
            } else {
                leftCorrect = true;
            }

            final Node rightNode = node.right;
            final boolean rightCorrect;
            if (rightNode != null) {
                final int rightNodeData = rightNode.data;
                rightCorrect = (min == -1 || rightNodeData > min)
                        && (max == -1 || rightNodeData < max)
                        && rightNodeData > node.data
                        && checkNode(rightNode, node.data, max);
            } else {
                rightCorrect = true;
            }

            nodeCorrect = leftCorrect && rightCorrect;
        }

        return nodeCorrect;
    }

    boolean checkBST(Node root) {
        return checkNode(root.left, -1, root.data) && checkNode(root.right, root.data, -1);
    }
}
