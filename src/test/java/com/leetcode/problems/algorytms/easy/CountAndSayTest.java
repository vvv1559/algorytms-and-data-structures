package com.leetcode.problems.algorytms.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountAndSayTest {
    @Test
    public void examples() throws Exception {
        CountAndSay countAndSay = new CountAndSay();
        assertEquals("1", countAndSay.countAndSay(1));
        assertEquals("1211", countAndSay.countAndSay(4));
        assertEquals("111221", countAndSay.countAndSay(5));
    }
}