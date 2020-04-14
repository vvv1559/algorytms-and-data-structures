package com.github.vvv1559.algorithms.leetcode.trees;

import com.github.vvv1559.algorithms.structures.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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