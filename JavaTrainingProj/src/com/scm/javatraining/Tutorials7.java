package com.scm.javatraining;

import java.util.Scanner;

/**
 * <h2>Tutorials6 Class</h2>
 * <p>
 * Process for Displaying Tutorials6
 * </p>
 * 
 * @author May Soe Thinzar Moe
 *
 */
public class Tutorials7 {
    /**
     * <h2>main</h2>
     * <p>
     * characters� pattern.
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);
        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to in the pattern ");
        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");
        int alphabet = 65;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print((char) (alphabet + j));
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(" ");
            }
            for (int l = rows - i; l >= 0; l--) {
                if (l != rows)
                    System.out.print((char) (alphabet + l));
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print((char) (alphabet + j));
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(" ");
            }
            for (int l = rows - i; l >= 0; l--) {
                if (l != rows)
                    System.out.print((char) (alphabet + l));
            }
            System.out.println();
        }
        scanner.close();
    }
}