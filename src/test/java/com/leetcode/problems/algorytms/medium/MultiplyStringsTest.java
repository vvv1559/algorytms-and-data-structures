package com.leetcode.problems.algorytms.medium;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class MultiplyStringsTest {
    private MultiplyStrings multiplyStrings = new MultiplyStrings();

    private void check(String fst, String snd) {
        BigInteger fstInt = new BigInteger(fst);
        BigInteger sndInt = new BigInteger(snd);
        assertEquals(fstInt.multiply(sndInt).toString(), multiplyStrings.multiply(fst, snd));
    }

    @Test
    public void simpleTest() throws Exception {
        check("9", "9");
        check("20", "20");
    }

    @Test
    public void fromChecks() throws Exception {
        check("98", "9");
        check("9", "99");
        check("123", "456");
    }
}