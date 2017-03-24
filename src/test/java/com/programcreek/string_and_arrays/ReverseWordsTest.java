package com.programcreek.string_and_arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsTest {

    private void testReverse(String original, String reversed) {
        final char[] s = original.toCharArray();
        ReverseWords.reverseWords(s);
        Assert.assertArrayEquals(reversed.toCharArray(), s);
    }

    @Test
    public void reverseWords() throws Exception {
        testReverse("the sky is blue", "blue is sky the");
        testReverse("this is sparta", "sparta is this");
        testReverse("the world is mine", "mine is world the");
        testReverse("one", "one");
    }

}