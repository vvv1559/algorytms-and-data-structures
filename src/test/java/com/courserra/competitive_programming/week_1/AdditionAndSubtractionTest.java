package com.courserra.competitive_programming.week_1;

import com.courserra.competitive_programming.InOutTestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AdditionAndSubtractionTest extends InOutTestCase {

    public AdditionAndSubtractionTest() {
        super(AdditionAndSubtraction.class, 2);
    }

    @Test
    public void examples() throws Exception {
        assertThat(testInOut(2, 1, 3), is("3"));
        assertThat(testInOut(2, 0, 3), is("-1"));
        assertThat(testInOut(2, 0, 1000), is("999"));
        assertThat(testInOut(100, 50, 100), is("1"));
        assertThat(testInOut(100, 50, 1000), is("37"));
        assertThat(testInOut(100, 110, 10), is("19"));
        assertThat(testInOut(10, 10, 10), is("1"));
        assertThat(testInOut(0, 10, 3), is("-1"));
        assertThat(testInOut(0, 0, 3), is("-1"));
        assertThat(testInOut(0, 0, 0), is("1"));
        assertThat(testInOut(2, 1, 1000), is("1997"));
    }
}