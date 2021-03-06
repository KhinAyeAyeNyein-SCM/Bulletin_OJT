package com.scm.javatraining;

import java.util.Scanner;

/**
 * <h2> Tutorials6 Class</h2>
 * <p>
 * Process for Displaying Tutorials6
 * </p>
 * 
 * @author May Soe Thinzar Moe
 *
 */
public class Tutorials6 {
    /**
     * <h2> main</h2>
     * <p>
     * numbers? pattern
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking rows value from the user
        System.out.println("How many rows you want in this pattern? ");
        int rows = sc.nextInt();
        System.out.println("Here is your pattern....!!!");

        // Printing upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            // Printing i spaces at the beginning of each row
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Printing i to rows value at the end of each row
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Printing lower half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            // Printing i spaces at the beginning of each row
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Printing i to rows value at the end of each row
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // Closing the resources
        sc.close();
    }
}