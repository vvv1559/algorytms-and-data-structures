package com.leetcode.problems.algorytms.easy;

import com.common.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeLevelOrderTraversal_IITest {

    @Test
    public void levelOrderBottom() {
        BinaryTreeLevelOrderTraversal_II tree = new BinaryTreeLevelOrderTraversal_II();
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(15, 7),
                Arrays.asList(9, 20),
                Collections.singletonList(3)
        );
        TreeNode node = TreeNode.fromArray(3, 9, 20, null, null, 15, 7);
        assertEquals(expected, tree.levelOrderBottom(node));
    }
}