package com.programcreek.string_and_arrays;


/*
* Origin text on http://www.programcreek.com/2014/05/leetcode-reverse-words-in-a-string-ii-java/
* Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
*
* The input string does not contain leading or trailing spaces and the words are always separated by a single space.
*
* For example,
* Given s = "the sky is blue",
* return "blue is sky the".
*
* Could you do it in-place without allocating extra space?
* */
class ReverseWords {

    private static void reverse(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    static void reverseWords(char[] s) {
        reverse(s, 0, s.length - 1);

        int i = 0;
        for (int j = 0; j < s.length; j++) {
            char c = s[j];
            if (c == ' ') {
                reverse(s, i, j - 1);
                i = j + 1;
            } else if (j == s.length - 1) {
                reverse(s, i, j);
            }
        }
    }
}
