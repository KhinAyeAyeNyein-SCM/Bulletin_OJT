package com.scm.javatraining;

import java.util.HashMap;
import java.util.Map;

/**
 * <h2> Tutorials9a Class</h2>
 * <p>
 * Process for Displaying Tutorials9a
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials12a {
    /**
     * <h2>main</h2>
     * <p>
     * To display specified value with the specified key in a HashMap
     * </p>
     *
     * @param args String[]
     */
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        for (Map.Entry x : hash_map.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}