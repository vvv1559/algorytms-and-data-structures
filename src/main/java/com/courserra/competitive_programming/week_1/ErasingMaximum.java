package com.courserra.competitive_programming.week_1;

import java.io.PrintWriter;
import java.util.Scanner;

public class ErasingMaximum {
    public static void main(String[] arg) {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {

            int n;
            n = in.nextInt();
            int[] a = new int[n];
            int max = 0;
            int maxValCounter = 0;
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
                if (a[i] > max) {
                    maxValCounter = 1;
                    max = a[i];
                } else if (a[i] == max && maxValCounter < 3) {
                    maxValCounter++;
                }
            }

            boolean hasVals = false;
            for (int anA : a) {
                if (anA == max) {
                    maxValCounter--;
                    if (maxValCounter == 0) continue;
                }

                if (hasVals) out.print(' ');
                out.print(anA);
                hasVals = true;
            }
            out.println();

        }
    }
}