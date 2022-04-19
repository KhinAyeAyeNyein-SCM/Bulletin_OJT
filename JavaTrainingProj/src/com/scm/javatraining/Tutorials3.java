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
public class Tutorials3 {
    /**
     * <h2>main</h2>
     * <p>
     * To display the pattern like right angle triangle
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        // loop between 1 to 10 numbers
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                // print the j number;
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}