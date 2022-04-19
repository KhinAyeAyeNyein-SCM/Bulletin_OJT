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
public class Tutorials4 {
    /**
     * <h2>main</h2>
     * <p>
     * To display the pattern like right angle triangle except odd number
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        // loop i number between 1 to 10
        for (int i = 1; i <= 10; i++) {
            // loop j number between 1 to i
            for (int j = 1; j <= i; j++) {
                // if j not equal 1 and j not equals odd number
                if (j != 1 && j % 2 != 0) {
                    System.out.print(" ");
                    continue;
                }
                // print the j number;
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}