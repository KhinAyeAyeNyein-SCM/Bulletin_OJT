package com.scm.javatraining;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * <h2> Tutorials6c Class</h2>
 * <p>
 * Process for Displaying Tutorials6c
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials9c {
    /**
     * <h2>main</h2>
     * <p>
     * To display leap year or not
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        int year;
        boolean x, y, z;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input the year: ");
            year = in.nextInt();
        }
        x = (year % 4) == 0;
        y = (year % 100) != 0;
        z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        
        // second way by using library
        boolean checkLeap = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(checkLeap ? year + " is a leap year" : year + " is not a leap year");
    }
}