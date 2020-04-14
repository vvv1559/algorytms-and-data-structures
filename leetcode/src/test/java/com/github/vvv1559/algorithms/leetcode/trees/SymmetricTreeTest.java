package com.github.vvv1559.algorithms.leetcode.trees;

import com.github.vvv1559.algorithms.structures.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetricTreeTest {

    @Test
    public void isSymmetric() {
        SymmetricTree symmetricTree = new SymmetricTree();
        assertTrue(symmetricTree.isSymmetric(TreeNode.fromArray()));
        assertTrue(symmetricTree.isSymmetric(TreeNode.fromArray(1)));
        assertTrue(symmetricTree.isSymmetric(TreeNode.fromArray(1, 2, 2, 3, 4, 4, 3)));
        assertFalse(symmetricTree.isSymmetric(TreeNode.fromArray(1, 2, 2, null, 3, null, 3)));
    }
}