package com.vvv1559.structures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DynamicArrayTest {
    private DynamicArray dynamicArray;

    @Before
    public void setup() {
        dynamicArray = new DynamicArray();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(0, dynamicArray.size());

        dynamicArray.add("Test");
        Assert.assertEquals(1, dynamicArray.size());
        Assert.assertEquals("Test", dynamicArray.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIncorrectIndex() {
        dynamicArray.get(100);
    }

    @Test
    public void testResize() {
        final int elementsCount = 15;
        for (int i = 0; i < elementsCount; i++) {
            dynamicArray.add("Test" + i);
        }

        Assert.assertEquals(elementsCount, dynamicArray.size());

        for (int i = 0; i < elementsCount; i++) {
            String value = dynamicArray.get(i).toString();
            Assert.assertEquals("Test" + i, value);
        }
    }
}