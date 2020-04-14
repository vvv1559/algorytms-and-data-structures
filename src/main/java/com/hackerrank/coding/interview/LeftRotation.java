package com.hackerrank.coding.interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Original task text on https://www.hackerrank.com/challenges/ctci-array-left-rotation
 * A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left
 * For example, if 2 left rotations are performed on array [1, 2, 3, 4, 5], then the array would become [3, 4, 5, 1, 2].
 * Given an array of n integers and a number, d, perform d left rotations on the array.
 * Then print the updated array as a single line of space-separated integers.
 * <p>
 * The first line contains two space-separated integers denoting the respective values of n (the number of integers)
 * and d (the number of left rotations you must perform). The second line contains n space-separated integers
 * describing the respective elements of the array's initial state.
 * <p>
 * <b>Constraints:</b>
 * 1 <= n <= 10^5
 * 1 <= d <= n
 * 1 <= a_i <= 10^6
 * <p>
 * <b>Output Format</b>
 * Print a single line of  space-separated integers denoting the final state of the array after performing d left
 * rotations.
 * <p>
 * <b>Sample Input</b>
 * 5 4
 * 1 2 3 4 5
 * <p>
 * <b>Sample output</b>
 * 5 1 2 3 4
 */

public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        /*
         * This solution has linear algorithmic complexity
         * */
        //Check extreme situations
        if (n != 1 && d != n) {
            //When n / d == 2.0, simple solution - switch places of i and i + d elements
            if (n / 2 == d && n % 2 == 0) {
                for (int i = 0; i < d; i++) {
                    int tmp = a[i];
                    a[i] = a[i + d];
                    a[i + d] = tmp;
                }
            } else {
                int lastIndex = 0;
                int lastValue = a[lastIndex];
                int shift = n - d;

                for (int i = 0; i < n; i++) {

                    int newIndex = lastIndex + shift;
                    newIndex = (newIndex >= n) ? newIndex - n : newIndex;
                    int tmp = a[newIndex];
                    a[newIndex] = lastValue;

                    lastValue = tmp;
                    lastIndex = newIndex;
                }
            }
        }

        System.out.print(Arrays.toString(a).replace("[", "").replace("]", "").replace(",", ""));
    }
}
