package com.scm.javatraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * <h2>Tutorials10c Class</h2>
 * <p>
 * Process for Displaying Tutorials10c
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials13c {
    /**
     * <h2>main</h2>
     * <p>
     * To display read first 3 lines from a file
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        String strLine = "";
        String filename = "D:\\Java\\JavaWorkSpace\\JavaTraining\\src\\com\\scm\\javatraining\\test.txt";
        try {
            LineNumberReader reader = new LineNumberReader(
                    new InputStreamReader(new FileInputStream(filename), "UTF-8"));
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
                System.out.println(strLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}