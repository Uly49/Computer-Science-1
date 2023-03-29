/**
 * Name: Ulysses Palomar (palomar)
 * Assignment: 4
 * 
 * Project/Class Description:
 * This program will demonstrate 4 examples of for loops
 * 
 * Known bugs:
 * none
 */
import java.util.*;

public class ForLoops {
    public static void main (String [] args) {
        //sets up scanner
        Scanner in = new Scanner(System.in);
        
        //first ection
        System.out.println("          ------ Section A ------");
        
        //initialize entered number and printed total
        int num = 0;
        int sum = 0;
        
        //ask user for positive digit
        System.out.print("Please enter a positive digit: ");
        num = in.nextInt();
        
        //tells user what is about to happen
        System.out.print("(for) Loop finds the sum of values ");
        System.out.println("between 1 and the entered number.");
        System.out.print("==================================");
        System.out.println("==================================");
        
        //for loop to find sum
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of values 1 through " + num + " = " + sum);
        
        //section divider
        System.out.print("\n-----------------------------------");
        System.out.println("------------------------------------\n");
        
        //second section
        System.out.println("          ------ Section B ------");
        
        //tells user what loop does
        System.out.print("(for) Loop prints valuess 48->4, ");
        System.out.println("seperated by underscores, by 4's");
        System.out.print("====================================");
        System.out.println("====================================");
        
        //loop to print values 48->4, seperated by underscores, by 4's
        for (int i = 48; i > 0; i -= 4) {
            System.out.print(i + "_");
            if (i == 4) {
                System.out.println("0");
            }
        }
        
        //section divider
        System.out.print("\n-----------------------------------");
        System.out.println("------------------------------------\n");
        
        //third section
        System.out.println("          ------ Section C ------");
        
        //tells user what loop does
        System.out.print("(for) Loop shows range of values ");
        System.out.println("representing distance measurements");
        System.out.println("      from 10 to 100 yards.");
        System.out.print("Using increments of 10, ");
        System.out.println("calculates equivalent meters.");
        System.out.print("====================================");
        System.out.println("====================================");
        
        //loop
        System.out.println("       Yards      Meters");
        System.out.print("--------------------------------");
        for (int i = 10; i <= 100; i += 10) {
            if (i == 10) {
                System.out.printf("\n\t " + i + "\t     " + "%.2f", (i * .9144));
            }
            else if (i == 100) {
                System.out.printf("\n\t" + i + "\t    " + "%.2f", (i * .9144));
            }
            else {
                System.out.printf("\n\t " + i + "\t    " + "%.2f", (i * .9144));
            }
        }
        
        //section divider
        System.out.print("\n-----------------------------------");
        System.out.println("------------------------------------\n");
        
        //fourth section
        System.out.println("          ------ Section D ------");
        
        //tells user what loop does
        System.out.println("(Nested for-loop)");
        System.out.print("Starting with the digit 9, ");
        System.out.println("print 10 rows of digits.");
        System.out.print("If the digit is 3 or 6 or 9, print ");
        System.out.println("the digit surrounded by ^ symbols.");
        System.out.print("If the digit any other number, print");
        System.out.println(" the digit surrounded by spaces");
        System.out.println("The outer loop will control the row number.");
        System.out.print("The inner loop will print ");
        System.out.println("the same value 5 times.");
        System.out.print("====================================");
        System.out.println("====================================");
        
        //heading
        System.out.println(" Rows of Digits");
        System.out.println("---------------");
        
        //for loop
        for (int i = 9; i >= 0; i--) {
            for (int j = 1; j <= 5; j++) {
                if ((i % 3) == 0 && i != 0) {
                    System.out.print("^" + i + "^");
                }
                else {
                    System.out.print(" " + i + " ");
                }
            }
            if (i != 0) {
                System.out.println();
            }
        }
    }
}