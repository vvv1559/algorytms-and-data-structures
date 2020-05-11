package com.github.vvv1559.algorithms.leetcode.strings;

/*
 * Decoded String at Index
 *
 * Original text: https://leetcode.com/problems/decoded-string-at-index/
 *
 * An encoded string S is given. To find and write the decoded string to a tape, the encoded string is read one
 * character at a time and the following steps are taken:
 *
 * 	If the character read is a letter, that letter is written onto the tape.
 * 	If the character read is a digit (say d), the entire current tape is repeatedly writtend-1more times in total.
 *
 *
 * Now for some encoded string S, and an index K, find and return the K-th letter (1 indexed) in the decoded string.
 *
 *
 * Example 1:
 *
 * Input: S = &quot;leet2code3&quot;, K = 10
 * Output: &quot;o&quot;
 * Explanation:
 * The decoded string is &quot;leetleetcodeleetleetcodeleetleetcode&quot;.
 * The 10th letter in the string is &quot;o&quot;.
 *
 *
 * Example 2:
 *
 * Input: S = &quot;ha22&quot;, K = 5
 * Output: &quot;h&quot;
 * Explanation:
 * The decoded string is &quot;hahahaha&quot;.  The 5th letter is &quot;h&quot;.
 *
 *
 * Example 3:
 *
 * Input: S = &quot;a2345678999999999999999&quot;, K = 1
 * Output: &quot;a&quot;
 * Explanation:
 * The decoded string is &quot;a&quot; repeated 8301530446056247680 times.  The 1st letter is &quot;a&quot;.
 *
 *
 * Note:
 *
 * 	2 &lt;= S.length &lt;= 100
 * 	Swill only contain lowercase letters and digits 2 through 9.
 * 	S starts with a letter.
 * 	1 &lt;= K &lt;= 10^9
 * 	The decoded string is guaranteed to have less than 2^63 letters.
 *
 *
 *
 *
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class DecodedStringAtIndex {
    public String decodeAtIndex(String S, int K) {
        long count = 0;
        int index;
        for (index = 0; index < S.length(); index++) {
            char c = S.charAt(index);

            if (Character.isLetter(c)) {
                count++;
            } else {
                count *= Character.getNumericValue(c);
            }

            if (count >= K) {
                break;
            }
        }


        while (true) {
            char c = S.charAt(index);
            if (Character.isLetter(c)) {
                if (K == count) {
                    return Character.toString(c);
                }
                count--;
            } else {
                count /= Character.getNumericValue(c);
                K = (int) (K % count == 0 ? count : K % count);
            }
            index--;
        }
    }
}