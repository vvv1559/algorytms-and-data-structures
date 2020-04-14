package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountAndSayTest {
    @Test
    public void examples() {
        CountAndSay countAndSay = new CountAndSay();
        assertEquals("1", countAndSay.countAndSay(1));
        assertEquals("1211", countAndSay.countAndSay(4));
        assertEquals("111221", countAndSay.countAndSay(5));
    }
}