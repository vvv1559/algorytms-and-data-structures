package com.hackerrank.coding.interview;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* Original text on https://www.hackerrank.com/challenges/ctci-ransom-note
* TODO: Add text
* */
public class RansomNote {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int m = in.nextInt();
        final int n = in.nextInt();
        final Map<String, Integer> magazine = new HashMap<>();

        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            final String word = in.next();
            final Integer count = magazine.getOrDefault(word, 0);
            magazine.put(word, count + 1);

        }

        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            final String word = in.next();
            final Integer wordsLeft = magazine.getOrDefault(word, 0);
            if (wordsLeft == 0) {
                System.out.println("No");
                return;
            }

            magazine.put(word, wordsLeft - 1);
        }

        System.out.println("Yes");
    }
}
