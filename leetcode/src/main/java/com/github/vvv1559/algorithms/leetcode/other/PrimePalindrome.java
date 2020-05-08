package com.github.vvv1559.algorithms.leetcode.other;

/*
 * Prime Palindrome
 *
 * Original text: https://leetcode.com/problems/prime-palindrome/
 *
 * Find the smallest prime palindrome greater than or equal to N.
 * Recall that a number is prime if it&#39;s only divisors are 1 and itself, and it is greater than 1.
 * For example, 2,3,5,7,11 and 13 are primes.
 * Recall that a number is a palindrome if it reads the same from left to right as it does from right to left.
 *
 * For example, 12321 is a palindrome.
 *
 * Example 1:
 *
 * Input: 6
 * Output: 7
 *
 *
 * Example 2:
 *
 * Input: 8
 * Output: 11
 *
 *
 * Example 3:
 *
 * Input: 13
 * Output: 101
 *
 * Note:
 *
 * 	1 &lt;= N &lt;= 10^8
 * 	The answer is guaranteed to exist and be less than 2 * 10^8.
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class PrimePalindrome {
    public int primePalindrome(int N) {
        if (N == 1) {
            return 2;
        }
        while (N != Integer.MAX_VALUE) {
            if (N == reverse(N) && isPrime(N)) {
                return N;
            }
            N++;

            // all 8 digit palindromes are not prime
            if (10_000_000 < N && N < 100_000_000) {
                N = 100_000_000;
            }
        }

        return N;
    }

    public boolean isPrime(int n) {
        if (n <= 3) {
            return true;
        }

        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }

    private int reverse(int n) {
        int res = 0;
        while (n > 0) {
            res = res * 10 + n % 10;
            n /= 10;
        }

        return res;
    }
}