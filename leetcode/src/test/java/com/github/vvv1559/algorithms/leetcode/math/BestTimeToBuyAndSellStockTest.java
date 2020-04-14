package com.github.vvv1559.algorithms.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {
    private BestTimeToBuyAndSellStock buyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    public void examples() {
        assertEquals(5, buyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(3, buyAndSellStock.maxProfit(new int[]{7, 8, 10, 4, 6, 4}));
        assertEquals(0, buyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    public void extremes() {
        assertEquals(1, buyAndSellStock.maxProfit(new int[]{1, 2}));
        assertEquals(0, buyAndSellStock.maxProfit(new int[]{2, 1}));
    }
}