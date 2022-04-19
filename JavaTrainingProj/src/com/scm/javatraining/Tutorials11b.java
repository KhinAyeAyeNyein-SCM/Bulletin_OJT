package com.scm.javatraining;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <h2> Tutorials8b Class</h2>
 * <p>
 * Process for Displaying Tutorials8b
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials11b {
    /**
     * <h2>main</h2>
     * <p>
     * To display swap two elements in arrayList
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Array list before Swap:");
        for (String a : c1) {
            System.out.println(a);
        }
        // Swapping 1st(index 0) element with the 3rd(index 2) element
        Collections.swap(c1, 0, 2);
        System.out.println("Array list after swap:");
        for (String b : c1) {
            System.out.println(b);
        }
    }
}
