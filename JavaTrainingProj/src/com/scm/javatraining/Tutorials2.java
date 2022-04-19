package com.scm.javatraining;

/**
 * <h2>Tutorials2 Class</h2>
 * <p>
 * Process for Displaying Tutorials2
 * </p>
 * 
 * @author EiMonSan
 *
 */
public class Tutorials2 {
    /**
     * <h2>main</h2>
     * <p>
     * To display the odd number between 1 to 10 and their sum.
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        // declare sum
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            // check odd number or not
            if (i % 2 != 0) {
                // add odd value to the sum
                sum += i;
                // print the odd number
                System.out.println(i);
            }
        }
        // print the total sum of odd number
        System.out.println("Total of Odd Number=>" + sum);
    }
}