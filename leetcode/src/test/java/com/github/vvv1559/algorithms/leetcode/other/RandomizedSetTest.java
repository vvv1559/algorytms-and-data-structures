package com.github.vvv1559.algorithms.leetcode.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomizedSetTest {

    @Test
    void fromExample() {
        RandomizedSet randomizedSet = new RandomizedSet();
        assertTrue(randomizedSet.insert(1));
        assertFalse(randomizedSet.remove(2));
        assertTrue(randomizedSet.insert(2));
        int random = randomizedSet.getRandom();
        assertTrue(random == 1 || random == 2);
        assertTrue(randomizedSet.remove(1));
        assertFalse(randomizedSet.insert(2));
        assertEquals(2, randomizedSet.getRandom());
        assertEquals(2, randomizedSet.getRandom());
        assertEquals(2, randomizedSet.getRandom());
        assertEquals(2, randomizedSet.getRandom());
    }
}