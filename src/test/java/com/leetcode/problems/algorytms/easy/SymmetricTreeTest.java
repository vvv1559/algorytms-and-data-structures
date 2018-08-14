package com.leetcode.problems.algorytms.easy;

import com.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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