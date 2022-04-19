package com.scm.javatraining;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <h2>Tutorials10b Class</h2>
 * <p>
 * Process for Displaying Tutorials10b
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials13b {
    /**
     * <h2>main</h2>
     * <p>
     * To display append text to an existing file
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        String strLine = "";
        try {
            String filename = "D:\\Java\\JavaWorkSpace\\JavaTraining\\src\\com\\scm\\javatraining\\test.txt";
            FileWriter fw = new FileWriter(filename, true);
            // appends the string to the file
            fw.write("Java Exercises\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader(filename));
            // read the file content
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
            br.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}