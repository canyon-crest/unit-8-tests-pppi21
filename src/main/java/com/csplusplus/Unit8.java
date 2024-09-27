package com.csplusplus;

import java.util.ArrayList;

public class Unit8 {

    // 1. Method to calculate the sum of all elements in a 2D array
    // Instructions: Traverse the 2D array and calculate the sum of all elements.
    public static int sumOfElements(int[][] array) {
    	int counter = 0;
       for(int i = 0; i < array.length; i++) {
    	   for(int e = 0; e < array[i].length; e++) {
    		   counter += array[i][e];
    	   }
       }
        return counter;  // Placeholder return value
    }

    // 2. Method to count how many times a specific number appears in a 2D array
    // Instructions: Traverse the 2D array and count the number of times a specified value appears.
    public static int countOccurrences(int[][] array, int value) {
    	int counter = 0;
        for(int i = 0; i < array.length; i++) {
     	   for(int e = 0; e < array[i].length; e++) {
     		   if(array[i][e] == value)
     			   counter++;
     	   }
        }
        return counter;  // Placeholder return value
    }

    // 3. Method to find the maximum element in a 2D array
    // Instructions: Traverse the 2D array and find the maximum element.
    public static int findMax(int[][] array) {
    	int counter = array[0][0];
        for(int i = 0; i < array.length; i++) {
     	   for(int e = 0; e < array[i].length; e++) {
     		   if(array[i][e] > counter)
     			   counter = array[i][e];
     	   }
        }
        return counter;  // Placeholder return value
    }

    // 4. Method to reverse the rows of the 2D array
    // Instructions: Reverse the rows of the 2D array (e.g., the first row becomes the last, etc.).
    public static void reverseRows(int[][] array) {
    	 int numRows = array.length;
    	    for (int i = 0; i < numRows / 2; i++) {
    	        int[] temp = array[i];
    	        array[i] = array[numRows - 1 - i];
    	        array[numRows - 1 - i] = temp;
    	    }
    }

    // 5. Method to transpose a 2D array (swap rows and columns)
    // Instructions: Create and return a new 2D array that is the transpose of the input array.
    public static int[][] transpose(int[][] array) {
    	 int numRows = array.length;
    	    int numCols = array[0].length;
    	    int[][] transposedArray = new int[numCols][numRows];
    	    for (int i = 0; i < numRows; i++) {
    	        for (int j = 0; j < numCols; j++) {
    	            transposedArray[j][i] = array[i][j];
    	        }
    	    }

        return transposedArray;  // Placeholder return value
    }

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
    	int array[][] = new int[numRows][numCols];
 
        for(int i = 0; i < array.length; i++) {
     	   for(int e = 0; e < array[i].length; e++) {
     		   array[i][e] = (int)(Math.random() * (max - min))+ min;
     	   }
        }
        return array;  // Placeholder return value
    }
}