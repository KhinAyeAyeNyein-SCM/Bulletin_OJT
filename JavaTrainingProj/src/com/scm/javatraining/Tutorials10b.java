package com.scm.javatraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <h2>Tutorials7b Class</h2>
 * <p>
 * Process for Displaying Tutorials7b
 * </p>
 * 
 * @author LwinMarWin
 *
 */
public class Tutorials10b {
    /**
     * <h2>main</h2>
     * <p>
     * To display remove specific element form array
     * </p>
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        System.out.println("Original Array : " + Arrays.toString(my_array));
        // Remove the second element (index->1, value->14) of the array
        int removeIndex = 1;
        // first way
        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }
        // We cannot alter the size of an array , after the removal, the last and second
        // last element in the array will exist twice
        System.out.println("After removing the second element: " + Arrays.toString(my_array));
        
        // second way
        List<Integer> numArrs = IntStream.of(my_array).boxed().collect(Collectors.toCollection(ArrayList::new));
        numArrs.remove(1);
        System.out.println(numArrs);
        
        // third way
        List<Integer> numArr = new ArrayList<Integer>(my_array.length);
        for (int i = 0; i < my_array.length; i++) {
            numArr.add(my_array[i]);
        }
        numArr.remove(1);
        System.out.println(numArr);
        
    }
}
