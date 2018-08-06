package com.courserra.competitive_programming.week_1;

import com.courserra.competitive_programming.InOutTestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class ErasingMaximumTest extends InOutTestCase {

    public ErasingMaximumTest() {
        super(ErasingMaximum.class, 2);
    }

    @Test
    public void examples() throws Exception {
        assertThat(testInOut(3, 1, 3, 2), is("1 2"));
        assertThat(testInOut(7, 4, 1, 4, 2, 4, 3, 4), is("4 1 4 2 3 4"));
        assertThat(testInOut(8, 4, 1, 4, 2, 4, 3, 4, 4), is("4 1 4 2 3 4 4"));
    }

    @Test
    public void maxTest() throws Exception {
        int[] data = maximumTest(100, 100);
        int[] maxTest = new int[data.length + 1];
        maxTest[0] = data.length;
        System.arraycopy(data, 0, maxTest, 1, data.length);
        assertThat(testInOut(maxTest), notNullValue());
    }

    @Test
    public void minTest() throws Exception {
        assertThat(testInOut(2, 1, 1), is("1"));
    }
}