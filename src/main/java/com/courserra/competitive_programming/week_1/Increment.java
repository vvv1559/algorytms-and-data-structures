package com.courserra.competitive_programming.week_1;

import java.io.PrintWriter;
import java.util.Scanner;

public class Increment {
    public static void main(String[] arg) {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {

            String num = in.next();
            boolean allNines = true;
            int digits = num.length();
            for (int i = 0; i < digits; i++) {
                if (num.charAt(i) != '9') {
                    allNines = false;
                }
            }

            out.println(allNines ? digits + 1: digits);
        }
    }
}