package com.courserra.competitive_programming.week_1;

import java.io.PrintWriter;
import java.util.Scanner;

public class AdditionAndSubtraction {
    public static void main(String[] arg) {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {

            int x, y, z;
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();

            int result = -1;

            if (x == y && z > x) {
                out.println(result);
                return;
            }

            int a = 0;
            for (int i = 1; a <= 1000; i++) {
                if (i % 2 != 0) {
                    a += x;
                } else {
                    a -= y;
                }

                if (a == z) {
                    result = i;
                    break;
                }
            }

            out.println(result);
        }
    }
}