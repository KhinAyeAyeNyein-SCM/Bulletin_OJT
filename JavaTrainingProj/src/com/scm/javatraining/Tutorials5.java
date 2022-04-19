package com.scm.javatraining;

import java.util.Scanner;

/**
 * <h2> Tutorials5 Class</h2>
 * <p>
 * Process for Displaying Tutorials5
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials5 {
    /**
     * <h2>main</h2>
     * <p>
     * To display * triangle
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input the number: ");
            int num = in.nextInt();
            for (int i = num; i > 0; i--) {
                for (int spc = num - i; spc > 0; spc--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}