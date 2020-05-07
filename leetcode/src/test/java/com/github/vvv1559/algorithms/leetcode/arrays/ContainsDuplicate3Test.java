package com.github.vvv1559.algorithms.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicate3Test {

    @Test
    void containsNearbyAlmostDuplicate() {
        ContainsDuplicate3 containsDuplicate3 = new ContainsDuplicate3();
        assertTrue(containsDuplicate3.containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 3, 0));
        assertTrue(containsDuplicate3.containsNearbyAlmostDuplicate(new int[]{2, 1}, 1, 1));
        assertTrue(containsDuplicate3.containsNearbyAlmostDuplicate(new int[]{1, 0, 1, 1}, 1, 2));
        assertFalse(containsDuplicate3.containsNearbyAlmostDuplicate(new int[]{1, 5, 9, 1, 5, 9}, 2, 3));
    }
}