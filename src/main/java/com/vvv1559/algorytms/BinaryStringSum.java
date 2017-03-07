package com.vvv1559.algorytms;

class BinaryStringSum {

    private static final char ZERO_CHAR = '0';
    private static final char ONE_CHAR = '1';

    /**
     * Functions receive strings. Each string represent a digit in binary form (high-order bit)
     *
     * @param first  First digit
     * @param second Second digit
     * @return Sum of digits in binary form
     */
    static String twoDigitsSum(String first, String second) {
        if (first == null || first.isEmpty()) {
            return second;
        } else if (second == null || second.isEmpty()) {
            return first;
        }

        final int maxLen = (first.length() > second.length()) ? first.length() : second.length();
        final char[] result = new char[maxLen + 1];

        char toNextDigit = ZERO_CHAR;
        for (int i = 0; i < maxLen; i++) {
            final char firstDigit = getCharFromEnd(first, i);
            final char secondDigit = getCharFromEnd(second, i);

            char resultChar;

            if (firstDigit == secondDigit) {
                resultChar = (toNextDigit == ONE_CHAR) ? ONE_CHAR : ZERO_CHAR;
                toNextDigit = (firstDigit == ONE_CHAR) ? ONE_CHAR : ZERO_CHAR;
            } else {
                resultChar = (toNextDigit == ONE_CHAR) ? ZERO_CHAR : ONE_CHAR;
            }

            result[maxLen - i] = resultChar;
        }

        if (toNextDigit == ONE_CHAR) {
            result[0] = ONE_CHAR;
            return new String(result);
        } else {
            return new String(result, 1, result.length - 1);
        }
    }

    private static char getCharFromEnd(String digit, int indexFromEnd) {
        final int index = digit.length() - indexFromEnd - 1;
        return (index < 0) ? ZERO_CHAR : digit.charAt(index);
    }
}
