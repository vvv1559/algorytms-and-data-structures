package com.vvv1559.algorytms;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ArrayTasksTest {
    @Test
    @Ignore
    public void moveZerosToEnd() throws Exception {
        int[] excepted = ArrayTasks.moveZerosToEnd(new int[]{8, 9, 0, 3, 0, 4, 5});
        Assert.assertArrayEquals(new int[]{8, 9, 3, 4, 5, 0, 0}, excepted);
    }

}