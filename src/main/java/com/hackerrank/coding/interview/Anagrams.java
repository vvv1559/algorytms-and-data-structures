package com.hackerrank.coding.interview;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Original text on https://www.hackerrank.com/challenges/ctci-making-anagrams
 * Given two strings, a and  b, that may or may not be of the same length, determine the minimum number of character
 * deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.
 *
 * <b>Input Format</b>
 * The first line contains a single string, a.
 * The second line contains a single string, b.
 *
 * <b>Constraints</b>
 * 1 <= |a|, |b| <= 10^4
 * It is guaranteed that a and b consist of lowercase English alphabetic letters (i.e., a through z).
 *
 * <b>Output Format</b>
 * Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.
 *
 * <b>Sample Input</b>
 * cde
 * abc
 *
 * <b>Sample Output</b>
 * 4
 * */
public class Anagrams {
    /*
     * Solved by using count-sort via hash table. This solution has linear algorithmic complexity O(n+m)
     * */
    private static int numberNeeded(String first, String second) {
        final Map<Character, Integer> firstLetters = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            final char ch = first.charAt(i);
            int letterCount = firstLetters.getOrDefault(ch, 0);
            letterCount++;
            firstLetters.put(ch, letterCount);
        }

        int counter = 0;
        for (int i = 0; i < second.length(); i++) {
            final char ch = second.charAt(i);
            if (!firstLetters.keySet().contains(ch)) {
                counter++;
            } else {
                int letterCount = firstLetters.get(ch);
                letterCount--;
                if (letterCount == 0) {
                    firstLetters.remove(ch);
                } else {
                    firstLetters.put(ch, letterCount);
                }
            }
        }

        for (Integer cnt : firstLetters.values()) {
            counter += cnt;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

}
