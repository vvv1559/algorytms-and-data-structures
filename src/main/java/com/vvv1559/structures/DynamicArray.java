package com.vvv1559.structures;

/**
 * Dynamic array - is array, who can change it size if it's need
 */
public class DynamicArray {
    private static final int INITIAL_SIZE = 10;
    private static final int RESIZE_FACTOR = 2;

    private Object[] data = new Object[INITIAL_SIZE];
    private int elementsCount = 0;


    /**
     * @param index index of element
     * @return element at index
     * @throws IndexOutOfBoundsException - when element with index does not exist in data
     */
    public Object get(int index) throws IndexOutOfBoundsException {
        if (elementsCount < index) {
            throw new IndexOutOfBoundsException();
        }

        return data[index];
    }


    /**
     * @param element element, witch be put in array
     */
    public void add(Object element) {
        if (elementsCount == data.length) {
            resizeData(data.length * RESIZE_FACTOR);
        }

        data[elementsCount] = element;
        elementsCount++;
    }


    /**
     * @return count of elements in array
     */
    public int size() {
        return elementsCount;
    }


    /**
     * @param newSize new data array size
     */
    private void resizeData(int newSize) {
        Object[] newData = new Object[newSize];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

}
