package com.scm.javatraining;

/**
 * <h2>Tutorials7a Class</h2>
 * <p>
 * Process for Displaying Tutorials7a
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials10a {
    /**
     * <h2>main</h2>
     * <p>
     * To display average value of array element
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        int[] numbers = new int[] { 20, 30, 25, 35, -16, 60, -100 };
        // calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        // calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}