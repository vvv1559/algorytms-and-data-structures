package com.github.vvv1559.algorithms.leetcode.math;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyStringsTest {
    private MultiplyStrings multiplyStrings = new MultiplyStrings();

    private void check(String fst, String snd) {
        BigInteger fstInt = new BigInteger(fst);
        BigInteger sndInt = new BigInteger(snd);
        assertEquals(fstInt.multiply(sndInt).toString(), multiplyStrings.multiply(fst, snd));
    }

    @Test
    public void simpleTest() {
        check("9", "9");
        check("20", "20");
    }

    @Test
    public void fromChecks() {
        check("98", "9");
        check("9", "99");
        check("123", "456");
    }
}