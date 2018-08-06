package com.courserra.competitive_programming.week_1;

import java.io.PrintWriter;
import java.util.Scanner;

public class StraightFlush {
    public static void main(String[] arg) {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {

            boolean allHasOneSuit = true;
            char suit = 0;
            int min = 20;
            int max = 0;
            boolean hasAce = false;
            int cardsCount = 5;
            for (int i = 0; i < cardsCount; i++) {
                String card = in.next();
                if (!allHasOneSuit) {
                    continue;
                }

                char cardSuit = card.charAt(1);
                if (i == 0) {
                    suit = cardSuit;
                } else if (cardSuit != suit) {
                    allHasOneSuit = false;
                }

                char cardRank = card.charAt(0);
                int points;
                if (cardRank == 'A') {
                    hasAce = true;
                    continue;
                } else if (cardRank == 'K') points = 13;
                else if (cardRank == 'Q') points = 12;
                else if (cardRank == 'J') points = 11;
                else if (cardRank == 'T') points = 10;
                else points = cardRank - '0';

                min = Math.min(min, points);
                max = Math.max(max, points);
            }

            boolean isStraightFlush = false;
            if (allHasOneSuit) {
                if (hasAce) {
                    isStraightFlush = (max - min == cardsCount - 2) && (max == 13 || min == 2);
                } else {
                    isStraightFlush = (max - min == cardsCount - 1);
                }
            }

            out.println(isStraightFlush ? "YES" : "NO");
        }
    }
}