package com.courserra.competitive_programming.week_1;

import com.courserra.competitive_programming.InOutTestCase;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IncrementTest extends InOutTestCase {

    public IncrementTest() {
        super(Increment.class, 2);
    }

    @Test
    public void examples() throws Exception {
        assertThat(testInOut(0), is("1"));
        assertThat(testInOut(3), is("1"));
        assertThat(testInOut(9), is("2"));
        assertThat(testInOut(13), is("2"));
        assertThat(testInOut(19), is("2"));
        assertThat(testInOut(99), is("3"));
    }

    @Test
    public void maxTest() throws Exception {
        char[] ch = new char[10_000_000];
        Arrays.fill(ch, '9');
        assertThat(testInOut(new String(ch)), is("10000001"));

        ch[0] = '8';
        assertThat(testInOut(new String(ch)), is("10000000"));
    }
}