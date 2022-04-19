package com.scm.javatraining;

import java.util.Scanner;

/**
 * <h2> Tutorials6b Class</h2>
 * <p>
 * Process for Displaying Tutorials6b
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials9b {
    /**
     * <h2>main</h2>
     * <p>
     * To display greatest number
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input the 1st number: ");
            num1 = in.nextInt();
            System.out.print("Input the 2nd number: ");
            num2 = in.nextInt();
            System.out.print("Input the 3rd number: ");
            num3 = in.nextInt();
        }
        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest: " + num1);
        } else if (num2 > num3) {
            System.out.println("The greatest: " + num2);
        } else {
            System.out.println("The greatest: " + num3);
        }
    }
}