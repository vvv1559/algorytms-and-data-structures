package com.hackerrank.coding.interview;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/*
* Original text on https://www.hackerrank.com/challenges/ctci-balanced-brackets?h_r=next-challenge&h_v=zen
* TODO: Add text
* */
public class BalancedBrackets {

    private static boolean isCloseBrace(char c) {
        return c == '}' || c == ']' || c == ')';
    }

    private static boolean isPair(char open, char close) {
        return (open == '[' && close == ']') || (open == '{' && close == '}') || (open == '(' && close == ')');
    }

    private static boolean isBalanced(String expression) {
        final Stack<Character> braces = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (isCloseBrace(c)) {
                if (braces.empty()) {
                    return false;
                }

                char prevC = braces.pop();
                if(!isPair(prevC, c)) {
                    return false;
                }

            } else {
                braces.push(c);
            }
        }

        return braces.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
