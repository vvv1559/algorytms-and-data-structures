package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BullsAndCowsTest {

    @Test
    void getHint() {
        BullsAndCows bullsAndCows = new BullsAndCows();
        assertEquals("1A3B", bullsAndCows.getHint("1807", "7810"));
        assertEquals("1A1B", bullsAndCows.getHint("1123", "0111"));
        assertEquals("0A4B", bullsAndCows.getHint("1122", "2211"));
        assertEquals("3A0B", bullsAndCows.getHint("1122", "1222"));
    }
}