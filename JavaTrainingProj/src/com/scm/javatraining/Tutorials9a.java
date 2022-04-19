package com.scm.javatraining;

import java.util.Scanner;

/**
 * <h2>Tutorials6a Class</h2>
 * <p>
 * Process for Displaying Tutorials6a
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials9a {
    /**
     * <h2>main</h2>
     * <p>
     * To display number is positive or negative
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input number: ");
            int input = in.nextInt();
            if (input > 0) {
                System.out.println("Number is positive");
            } else if (input < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }
        }
    }
}