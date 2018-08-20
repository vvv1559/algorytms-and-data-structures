package com.leetcode.problems.algorytms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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