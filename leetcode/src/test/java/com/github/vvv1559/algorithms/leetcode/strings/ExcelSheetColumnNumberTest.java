package com.github.vvv1559.algorithms.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelSheetColumnNumberTest {

    @Test
    public void titleToNumber() {
        ExcelSheetColumnNumber number = new ExcelSheetColumnNumber();
        assertEquals(1, number.titleToNumber("A"));
        assertEquals(28, number.titleToNumber("AB"));
        assertEquals(701, number.titleToNumber("ZY"));
        assertEquals(703, number.titleToNumber("AAA"));
        assertEquals(475253, number.titleToNumber("ZZZY"));
    }
}