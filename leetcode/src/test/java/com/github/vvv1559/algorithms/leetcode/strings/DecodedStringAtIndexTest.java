package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodedStringAtIndexTest {

    @Test
    void decodeAtIndex() {
        DecodedStringAtIndex decodedStringAtIndex = new DecodedStringAtIndex();
        assertEquals("o", decodedStringAtIndex.decodeAtIndex("leet2code3", 10));
        assertEquals("d", decodedStringAtIndex.decodeAtIndex("leet2code3", 35));
        assertEquals("h", decodedStringAtIndex.decodeAtIndex("ha22", 5));

        assertEquals("a", decodedStringAtIndex.decodeAtIndex("a23", 6));
    }
}