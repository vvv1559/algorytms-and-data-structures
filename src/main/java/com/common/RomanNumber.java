package com.common;

public enum RomanNumber {
    M(1000, true),
    D(500, false),
    C(100, true),
    L(50, false),
    X(10, true),
    V(5, false),
    I(1, true);

    private final int intValue;
    private final boolean isOne;

    public static RomanNumber fromChar(char c) {
        return RomanNumber.valueOf(Character.toString(c));
    }

    RomanNumber(int intValue, boolean isOne) {
        this.intValue = intValue;
        this.isOne = isOne;
    }

    public int getIntValue() {
        return intValue;
    }

    public boolean isOne() {
        return isOne;
    }
}
