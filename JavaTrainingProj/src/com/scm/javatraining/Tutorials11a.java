package com.scm.javatraining;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2> Tutorials8a Class</h2>
 * <p>
 * Process for Displaying Tutorials8a
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials11a {
    /**
     * <h2>main</h2>
     * <p>
     * To display element of arrayList
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);
    }
}