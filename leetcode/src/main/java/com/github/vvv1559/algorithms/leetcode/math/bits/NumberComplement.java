package com.github.vvv1559.algorithms.leetcode.math.bits;

/*
 * Number Complement
 *
 * Original text: https://leetcode.com/problems/number-complement/
 *
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary
 * representation.
 *
 * Example 1:Input: 5Output: 2Explanation: The binary representation of 5 is 101 (no leading zero bits), and its
 * complement is 010. So you need to output 2.
 *
 * Example 2:Input: 1Output: 0Explanation: The binary representation of 1 is 1 (no leading zero bits), and its
 * complement is 0. So you need to output 0.
 *
 * Note:	The given integer is guaranteed to fit within the range of a 32-bit signed integer.	You could assume no leading
 * zero bit in the integer&rsquo;s binary representation.	This question is the same as
 * 1009:https://leetcode.com/problems/complement-of-base-10-integer/
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.EASY)
class NumberComplement {

    public int findComplement(int num) {
        if (num == 0) {
            return 1;
        }

        int tmp = num;
        int mask = 0;

        while (tmp > 0) {
            tmp >>= 1;
            mask <<= 1;
            mask++;
        }

        return num ^ mask;
    }
}