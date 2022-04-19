package com.scm.javatraining;

import java.util.Scanner;

/**
 * <h2> Tutorials14 Class</h2>
 * <p>
 * Process for Displaying Tutorials14
 * </p>
 * 
 * @author EiMonSan
 *
 */
public class Tutorials14 {
    /**
     * <h2>main</h2>
     * <p>
     * To calculate Fibonacci Series up to n numbers.
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = s.nextInt();
        if (n > 0) {
            showfibonacci(n);
        } else {
            System.out.println("Please enter positive number");
        }
        s.close();
    }

    /**
     * <h2> showfibonacci</h2>
     * <p>
     * Show Fibonacci
     * </p>
     *
     * @param no inputNumber
     */
    static void showfibonacci(int no) {
        int f1, f2 = 0, f3 = 1;
        for (int i = 1; i <= no; i++) {
            System.out.print(f3);
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
    }
}