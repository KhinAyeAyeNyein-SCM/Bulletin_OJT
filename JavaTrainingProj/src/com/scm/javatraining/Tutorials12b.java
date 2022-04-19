package com.scm.javatraining;

import java.util.HashMap;

/**
 * <h2> Tutorials9b Class</h2>
 * <p>
 * Process for Displaying Tutorials9b
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials12b {
    /**
     * <h2>main</h2>
     * <p>
     * To display copy all of the mappings from the specified map to another map
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        // create two hash maps
        HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();
        // populate hash maps
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        System.out.println("\nValues in first map: " + hash_map1);
        hash_map2.put(4, "White");
        hash_map2.put(5, "Blue");
        hash_map2.put(6, "Orange");
        System.out.println("\nValues in second map: " + hash_map2);
        // put all values in secondmap
        hash_map2.putAll(hash_map1);
        System.out.println("\nNow values in second map: " + hash_map2);
    }
}