package com.github.vvv1559.algorithms.leetcode.strings;

/*
 * Validate IP Address
 *
 * Original text: https://leetcode.com/problems/validate-ip-address/
 *
 * Write a function to check whether an input string is a valid IPv4 address or IPv6 address or neither.
 *
 *
 * IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each
 * ranging from 0 to 255, separated by dots ("."), e.g.,172.16.254.1;
 *
 *
 * Besides, leading zeros in the IPv4 is invalid. For example, the address 172.16.254.01 is invalid.
 *
 *
 * IPv6 addresses are represented as eight groups of four hexadecimal digits, each group representing 16 bits. The
 * groups are separated by colons (":"). For example, the address 2001:0db8:85a3:0000:0000:8a2e:0370:7334 is a valid
 * one. Also, we could omit some leading zeros among four hexadecimal digits and some low-case characters in the address
 * to upper-case ones, so 2001:db8:85a3:0:0:8A2E:0370:7334 is also a valid IPv6 address(Omit leading zeros and using
 * upper cases).
 *
 *
 *
 * However, we don't replace a consecutive group of zero value with a single empty group using two consecutive colons
 * (::) to pursue simplicity. For example, 2001:0db8:85a3::8A2E:0370:7334 is an invalid IPv6 address.
 *
 *
 * Besides, extra leading zeros in the IPv6 is also invalid. For example, the address
 * 02001:0db8:85a3:0000:0000:8a2e:0370:7334 is invalid.
 *
 *
 * Note:
 * You may assume there is no extra space or special characters in the input string.
 *
 *
 * Example 1:
 *
 * Input: "172.16.254.1"
 * Output: "IPv4"
 * Explanation: This is a valid IPv4 address, return "IPv4".
 *
 *
 *
 * Example 2:
 *
 * Input: "2001:0db8:85a3:0:0:8A2E:0370:7334"
 * Output: "IPv6"
 * Explanation: This is a valid IPv6 address, return "IPv6".
 *
 *
 *
 * Example 3:
 *
 * Input: "256.256.256.256"
 * Output: "Neither"
 * Explanation: This is neither a IPv4 address nor a IPv6 address.
 *
 *
 * */

import com.github.vvv1559.algorithms.annotations.Difficulty;
import com.github.vvv1559.algorithms.annotations.Level;

@Difficulty(Level.MEDIUM)
class ValidateIpAddress {
    public String validIPAddress(String IP) {
        int start = 0;
        boolean ipV4 = false;
        boolean ipV6 = false;
        int numberOfParts = 1;
        boolean valid = true;
        for (int i = 0; i <= IP.length() && valid; i++) {
            if (i == IP.length()) {
                if (ipV4) {
                    valid = validV4Part(IP, start, i);
                } else if (ipV6) {
                    valid = validV6Part(IP, start, i);
                }
            } else {
                char c = IP.charAt(i);
                if (c == '.') {
                    numberOfParts++;
                    ipV4 = true;
                    valid = validV4Part(IP, start, i);
                    start = i + 1;
                } else if (c == ':') {
                    numberOfParts++;
                    ipV6 = true;
                    valid = validV6Part(IP, start, i);
                    start = i + 1;
                }
            }
        }

        if (!valid || ipV4 == ipV6) {
            return "Neither";
        }

        if (ipV4 && numberOfParts == 4) {
            return "IPv4";
        }

        if (ipV6 && numberOfParts == 8) {
            return "IPv6";
        }

        return "Neither";
    }

    private boolean validV4Part(String ip, int start, int end) {
        int len = end - start;
        if (len == 0 || len > 3) {
            return false;
        }

        if (len > 1 && ip.charAt(start) == '0') {
            return false;
        }

        int num = 0;
        for (int i = start; i < end; i++) {
            char c = ip.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
            num = num * 10 + c - '0';
        }

        return num < 256;
    }

    private boolean validV6Part(String ip, int start, int end) {
        if (start == end) {
            return false;
        }

        if (end - start > 4) {
            return false;
        }

        for (int i = start; i < end; i++) {
            char c = ip.charAt(i);
            char lowerChar = Character.toLowerCase(c);

            if (!Character.isDigit(c) && !(lowerChar >= 'a' && lowerChar <= 'f')) {
                return false;
            }
        }

        return true;
    }
}