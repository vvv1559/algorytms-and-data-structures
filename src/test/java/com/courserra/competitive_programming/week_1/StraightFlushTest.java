package com.courserra.competitive_programming.week_1;

import com.courserra.competitive_programming.InOutTestCase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StraightFlushTest extends InOutTestCase {

    public StraightFlushTest() {
        super(StraightFlush.class, 2);
    }

    @Test
    public void examples() throws Exception {
        assertThat(testInOut("2D 5D 3D 4D 6D"), is("YES"));
        assertThat(testInOut("QH JH TH 9H 8H"), is("YES"));
        assertThat(testInOut("AH KH QH JH TH"), is("YES"));
        assertThat(testInOut("5D 4D 3D 2D AD"), is("YES"));
        assertThat(testInOut("QS KS AS 2S 3S"), is("NO"));
        assertThat(testInOut("AD KH QH JS TC"), is("NO"));

    }
}