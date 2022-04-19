package com.scm.javatraining;

import java.util.Scanner;

/**
 * <h2>Tutorials14 Class</h2>
 * <p>
 * Process for Displaying Tutorials15
 * </p>
 * 
 * @author EiMonSan
 *
 */
public class Tutorials15 {
    /**
     * <h2>main</h2>
     * <p>
     * To find out whether the given String is Palindrome or not
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("***Enter input to check palindrome or not***");
        String n = s.nextLine();
        checkPalindrome(n);
        s.close();
    }

    /**
     * <h2>showfibonacci</h2>
     * <p>
     * Show Fibonacci
     * </p>
     *
     * @param no inputNumber
     */
    static void checkPalindrome(String inputSentence) {
        // Assuming result to be true
        boolean result = true;
        int length = inputSentence.length();
        // dividing the length of the string by 2 and comparing it.
        for (int i = 0; i <= length / 2; i++) {
            if (inputSentence.charAt(i) != inputSentence.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }
        System.out.println(result ? inputSentence + " is palindrome" : inputSentence + " is not palindrome" );
    }
}