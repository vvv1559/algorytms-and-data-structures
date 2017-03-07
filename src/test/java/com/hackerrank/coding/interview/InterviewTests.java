package com.hackerrank.coding.interview;

import com.hackerrank.coding.SimpleTestSystem;
import org.junit.Assert;
import org.junit.Test;

public class InterviewTests {
    @Test
    public void leftShift() throws Exception {
        Assert.assertEquals("1", SimpleTestSystem.doTest(LeftRotation.class, "1 1 1"));
        Assert.assertEquals("1 2 3 4 5", SimpleTestSystem.doTest(LeftRotation.class, "5 5 1 2 3 4 5"));
        Assert.assertEquals("5 1 2 3 4", SimpleTestSystem.doTest(LeftRotation.class, "5 4 1 2 3 4 5"));
        Assert.assertEquals("2 3 4 5 1", SimpleTestSystem.doTest(LeftRotation.class, "5 1 1 2 3 4 5"));
        Assert.assertEquals("3 4 5 1 2", SimpleTestSystem.doTest(LeftRotation.class, "5 2 1 2 3 4 5"));
        Assert.assertEquals("77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77", SimpleTestSystem.doTest(LeftRotation.class, "20 10 41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51"));
    }


    @Test
    public void anagrams() {
        Assert.assertEquals("4", SimpleTestSystem.doTest(Anagrams.class, "cde\nabc"));
        Assert.assertEquals("0", SimpleTestSystem.doTest(Anagrams.class, "abc\nabc"));
        Assert.assertEquals("5", SimpleTestSystem.doTest(Anagrams.class, "aaaaaaa\naa"));
    }

}