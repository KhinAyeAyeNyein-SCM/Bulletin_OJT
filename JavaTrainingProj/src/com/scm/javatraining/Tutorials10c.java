package com.scm.javatraining;

import java.util.ArrayList;

/**
 * <h2>Tutorials7c Class</h2>
 * <p>
 * Process for Displaying Tutorials7c
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials10c {
    /**
     * <h2>main</h2>
     * <p>
     * To display convert arrayList to array
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Python");
        list.add("Java");
        list.add("PHP");
        list.add("C#");
        list.add("C++");
        list.add("Perl");
        String[] my_array = new String[list.size()];
        list.toArray(my_array);
        for (String string : my_array) {
            System.out.println(string);
        }
    }
}