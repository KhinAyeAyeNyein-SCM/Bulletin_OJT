package com.scm.javatraining;

import java.io.File;
import java.util.Date;

/**
 * <h2>Tutorials10a Class</h2>
 * <p>
 * Process for Displaying Tutorials10a
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials13a {
    /**
     * <h2>main</h2>
     * <p>
     * To display last modified time of a file
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        File file = new File("test.txt");
        Date date = new Date(file.lastModified());
        System.out.println("\nThe file was last modified on: " + date + "\n");
    }
}