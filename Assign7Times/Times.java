/**
 * Name:  Ulysses Palomar (Palomar)
 * Course:  CSCI-241 - Computer Science I
 * Section: 001
 * Assignment: 7
 * 
 * Project/Class Description:
 * This program will print an array
 * of ints in different formats
 * 
 * Known Bugs:
 * none
 */

import java.util.*;

public class Times  {
    public static void main (String [] args)        {
        // make an array that holds 10 different integers representing seconds
        int [] myTimes = {3398, 2067, 3064, 68, 94, 2407, 368, 1009, 1316, 2614};
        
        
        // ask the user whether to use fixed array or a new one of random size
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 1 for fixed 10-element array, 2 for random array: ");
        int selection = keyboard.nextInt();
        if (selection == 2) {
            System.out.print("Enter # of elements in array: ");
            int newSize = keyboard.nextInt();
            // save the value entered by the user and make an integer array of that size
            // assign that new space to the array named myTimes
            // fill all locations in the array with a random value between 1 and 3599.
            myTimes = new int[newSize];
            for (int i = 0; i < newSize; i++) {
                myTimes[i] = (int)(Math.random()*3599 + 1);
            }
        }
        // print original array with seconds values
        System.out.println("Original array contents");
        System.out.println("-----------------------");
        printArrayValues(myTimes);
        
        
        // print the values in the array, as minute:second format
        System.out.println("Original times in minutes:seconds format");
        System.out.println("----------------------------------------");
        printTimes(myTimes);
        
        
        // add all times and print the sum
        System.out.println();
        System.out.println("Times in this array total over " 
                             + sumTimes(myTimes) + " minutes");
        System.out.println();
        System.out.println();
 
        // ask user for a threshold number of minutes;
        // you'll find all values over that number and return
        System.out.print("Enter minute threshold for new array: ");
        int max = keyboard.nextInt();
        System.out.println();
        
        // find all times that exceed max minutes, return that array; print it
        printArrayValues(myTimes);
        int [] overMax = overGivenMinutes(max, myTimes);
        
        // print the values in the array, as minute/second combinations
        System.out.println("Printing times over " + max + " minutes");
        System.out.println("------------------------------");        
        // call the printTimes() method to print the overMax array
        // values in minutes:seconds format
        printTimes(overMax);
        
        // call method to fill in quartiles array
        int [] quartiles = quartiles(myTimes);
       
        
        // print the quartiles array
        System.out.println();
        System.out.println("Printing quartiles ...");
        System.out.println("  1st  2nd  3rd  4th");
        System.out.println(" ---- ---- ---- ----");
        //print the quartiles array contents, using printArrayValues
        printArrayValues(quartiles);
    }
    
    //Method prints array values formatted to 5 values per line
    public static void printArrayValues(int [] myTimes) {
        for (int i = 1; i < myTimes.length + 1; i++) {
            System.out.printf("%4d ", myTimes[i - 1]);
            if (i % 5 == 0) {
                System.out.println();
            }
            if ((i == (myTimes.length + 1)) && (i % 5 != 0)) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    //Method prints array values as time in minutes
    public static void printTimes(int [] myTimes) {
        for (int i = 0; i < myTimes.length; i++) {
            int sec = myTimes[i] % 60;
            int min = myTimes[i] / 60;
            System.out.printf("Time[%02d] = ", i);
            System.out.printf("%02d:", min);
            System.out.printf("%02d%n", sec);
        }
        System.out.println();
    }
    
    //Method to add all values in array and translate to minutes, no seconds
    public static int sumTimes(int [] myTimes) {
        int sum = 0;
        for (int i = 0; i < myTimes.length; i++) {
            sum = sum + myTimes[i];
        }
        int sumMin = sum / 60;
        return sumMin;
    }
    
    //Method to create new array within threshold
    public static int[] overGivenMinutes(int max, int [] myTimes) {
        int count = 0;
        int [] myTimes2 = new int [myTimes.length];
        for (int i = 0; i < myTimes2.length; i++) {
            myTimes2[i] = myTimes[i];
        }
        for (int i = 0; i < myTimes2.length; i++) {
            if ((myTimes2[i] / 60) >= max) {
                count++;
            }
        }
        int [] overMax = new int [count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < myTimes2.length; j++) {
                if (myTimes2[j] / 60 >= max && overMax[i] == 0) {
                    overMax[i] = myTimes2[j];
                    myTimes2[j] = 0;
                }
            }
        }
        return overMax;
    }
    
    //Method makes array separating time values into quartiles
    public static int[] quartiles(int [] myTimes) {
        int [] quartiles = new int [4];
        for (int j = 0; j < myTimes.length; j++) {
            if (myTimes[j] <= 900) {
                quartiles[0]++;
            }
            else if ((myTimes[j] > 900) && (myTimes[j] <= 1800)) {
                quartiles[1]++;
            }
            else if ((myTimes[j] > 1800) && (myTimes[j] <= 2700)) {
                quartiles[2]++;
            }
            else if (myTimes[j] > 2700) {
                quartiles[3]++;
            }
        }
        return quartiles;
    }
}
