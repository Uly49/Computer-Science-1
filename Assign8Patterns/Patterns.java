/**
 * Name:  Ulysses Palomar (Palomar)
 * Course:  CSCI-241 - Computer Science I
 * Section: 001
 * Assignment: 8
 * 
 * Project/Class Description:
 * This program will create a 2-D array of size determined by user.
 * Then it will print various patterns of the 2-D array.
 * 
 * Known Bugs:
 * none
 */

import java.util.*;

public class Patterns {
    
    //Public class constant to hold character
    public static char CHARACTER = '$';
    public static int DIMENSIONS;
    
    public static void main (String [] args) {
        setDimension();
        char [][] twoDArray = new char [DIMENSIONS][DIMENSIONS];
        clear(twoDArray);
        
        System.out.println("Running odds()");
        odds(twoDArray);
        print(twoDArray);
        clear(twoDArray);
        
        System.out.println("Running evens()");
        evens(twoDArray);
        print(twoDArray);
        clear(twoDArray);
        
        System.out.println("Running upperLeft()");
        upperLeft(twoDArray);
        print(twoDArray);
        clear(twoDArray);
        
        System.out.println("Running upperRight()");
        upperRight(twoDArray);
        print(twoDArray);
        clear(twoDArray);
        
        System.out.println("Running lowerLeft()");
        lowerLeft(twoDArray);
        print(twoDArray);
        clear(twoDArray);
        
        System.out.println("Running lowerRight()");
        lowerRight(twoDArray);
        print(twoDArray);
        clear(twoDArray);
        
        System.out.println("Running joinedBlocks()");
        joinedBlocks(twoDArray);
        print(twoDArray);
        clear(twoDArray);
    }
    
    //Method that sets the dimensions of the 2-D array
    public static void setDimension () {
        Scanner keyboard = new Scanner(System.in);
        do {
        System.out.print("Enter grid dimension (odd between 5 and 15):");
        DIMENSIONS = keyboard.nextInt();
        if (DIMENSIONS % 2 == 0) {
            System.out.println("Error: not an odd number.");
        }
        if ((DIMENSIONS < 5) || (DIMENSIONS > 15)) {
            System.out.println("Error: not between 5 and 15.");
        }
        } while ((DIMENSIONS % 2 == 0) || (DIMENSIONS < 5) || (DIMENSIONS > 15));
    }
    
    //Method to print 2-D array
    public static void print(char [][] array) {
        int dashCount = 0;
        
        //Setting amount of dashes to print
        if (array.length == 5) {
            dashCount = 11;
        }
        else if (array.length == 7) {
            dashCount = 15;
        }
        else if (array.length == 9) {
            dashCount = 19;
        }
        else if (array.length == 11) {
            dashCount = 23;
        }
        else if (array.length == 13) {
            dashCount = 27;
        }
        else if (array.length == 15) {
            dashCount = 31;
        }

        for (int i = 0; i < dashCount; i++) {
            System.out.print("-");
        }
        
        System.out.println();
        
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(" " + array[row][col]);
            }
            System.out.println();
        }
        
        for (int i = 0; i < dashCount; i++) {
            System.out.print("-");
        }
        
        System.out.println();
    }
    
    //Method to add blank space to each element in array
    public static void clear(char [][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = ' ';
            }
        }
    }
    
    //Method to fill odd cells
    public static void odds(char [][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if ((row % 2 != 0) && (col % 2 != 0)) {
                    array[row][col] = CHARACTER;
                }
            }
        }
    }
    
    //Method to fill even cells
    public static void evens(char [][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if ((row % 2 == 0) && (col % 2 == 0)) {
                    array[row][col] = CHARACTER;
                }
            }
        }
    }
    
    //Method to print upper left corner
    public static void upperLeft(char [][] array) {
        int mid = array.length / 2;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if ((row < mid) && (col < mid)) {
                    array[row][col] = CHARACTER;
                }
            }
        }
    }
    
    //Method to print upper right corner
    public static void upperRight(char [][] array) {
        int mid = array.length / 2;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if ((row < mid) && (col > mid)) {
                    array[row][col] = CHARACTER;
                }
            }
        }
    }
    
    //Method to print lower left corner
    public static void lowerLeft(char [][] array) {
        int mid = array.length / 2;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if ((row > mid) && (col < mid)) {
                    array[row][col] = CHARACTER;
                }
            }
        }
    }
    
    //Method to print lower right corner
    public static void lowerRight(char [][] array) {
        int mid = array.length / 2;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if ((row > mid) && (col > mid)) {
                    array[row][col] = CHARACTER;
                }
            }
        }
    }
    
    //Method to print joined blocks
    public static void joinedBlocks(char [][] array) {
        //Calling other methods to fill each corner
        upperLeft(array);
        upperRight(array);
        lowerLeft(array);
        lowerRight(array);
        int mid = array.length / 2;
        array[mid][mid] = CHARACTER;
    }
}