package com.vvv1559.algorytms;

public class ArrayTasks {

    /**
     * @param sourceArray - array of ints
     * @return array of ints, witch contains elements of source array, but all 0 moved to the end
     */
    static int[] moveZerosToEnd(int[] sourceArray) {
        int lastIndex = sourceArray.length - 1;
        int lastNotZeroPosition = 0;

        for (int i = 0; i < sourceArray.length; i++) {
            int value = sourceArray[i];
            if (value != 0 && i != lastIndex) {
                sourceArray[i] = sourceArray[lastNotZeroPosition];
                sourceArray[lastNotZeroPosition] = value;
                lastNotZeroPosition = i;
            }
        }

        return sourceArray;
    }

}
