package com.github.vvv1559.algorithms.leetcode.other;

/*
 * Insert Delete GetRandom O(1)
 *
 * Original text: https://leetcode.com/problems/insert-delete-getrandom-o1/
 *
 * Design a data structure that supports all following operations in average O(1) time.
 *
 *
 * insert(val): Inserts an item val to the set if not already present.
 * remove(val): Removes an item val from the set if present.
 * getRandom: Returns a random element from current set of elements. Each element must have the same probability of
 * being returned.
 *
 *
 *
 * Example:
 *
 * // Init an empty set.
 * RandomizedSet randomSet = new RandomizedSet();
 * // Inserts 1 to the set. Returns true as 1 was inserted successfully.
 * randomSet.insert(1);
 * // Returns false as 2 does not exist in the set.
 * randomSet.remove(2);
 * // Inserts 2 to the set, returns true. Set now contains [1,2].
 * randomSet.insert(2);
 * // getRandom should return either 1 or 2 randomly.
 * randomSet.getRandom();
 * // Removes 1 from the set, returns true. Set now contains [2].
 * randomSet.remove(1);
 * // 2 was already in the set, so return false.
 * randomSet.insert(2);
 * // Since 2 is the only number in the set, getRandom always return 2.
 * randomSet.getRandom();
 *
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Difficulty(Level.MEDIUM)
class RandomizedSet {

    private final Map<Integer, Integer> valToIndex;

    private final List<Integer> values;

    private final Random random;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        values = new ArrayList<>();
        valToIndex = new HashMap<>();
        random = new Random();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        boolean valueMissing = !valToIndex.containsKey(val);
        if (valueMissing) {
            int idx = values.size();
            values.add(val);
            valToIndex.put(val, idx);
        }
        return valueMissing;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        Integer index = valToIndex.remove(val);
        if (index == null) {
            return false;
        }

        int lastIndex = values.size() - 1;
        Integer lastValue = values.remove(lastIndex);
        if (index != lastIndex) {
            values.set(index, lastValue);
            valToIndex.put(lastValue, index);
        }

        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return values.get(random.nextInt(values.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */