/**
 * Name: Ulysses Palomar (palomar)
 * Assignment: 4
 * 
 * Project/Class Description:
 * This program will demonstrate 2 examples of do while loops
 * 
 * Known bugs:
 * none
 */
import java.util.*;

public class DoWhileLoops {
    public static void main (String [] args) {
        //Sets up scanner
        Scanner in = new Scanner(System.in);
        
        //Tells user what this first loop does
        System.out.println("          ------ Section A ------");
        System.out.print("(do-while) User enters number that is a ");
        System.out.println("multiple of 5.");
        System.out.print("After the loop, it prints the final ");
        System.out.println("accepted number.");
        System.out.print("====================================");
        System.out.println("====================================");
        
        //Initialize guess variable
        int guess = 0;
        
        //Starts loop and asks user for multiple of 5
        do {
            System.out.print("Enter a number that is a multiple of 5: ");
            guess = in.nextInt();
            if ((guess % 5) != 0) {
                System.out.println("Error: number must be a multiple of 5.");
            }
        } while ((guess % 5) != 0);
        System.out.println("Multiple of 5 entered: " + guess);
        
        System.out.print("\n------------------------------------");
        System.out.println("------------------------------------");
        
        //Tells user what this second loop does
        System.out.println("\n          ------ Section B ------");
        System.out.print("(do-while) User enters number ");
        System.out.println("between 0 and 12, inclusive");
        System.out.print("After the loop, it prints ");
        System.out.println("the final accepted number.");
        System.out.print("====================================");
        System.out.println("====================================");
        
        //Initialize second guess variable
        int guess2 = 0;
        
        //Starts loop and asks user of number between 0 and 12, inclusive
        do {
            System.out.print("Enter a number between 0 and 12, inclusive: ");
            guess2 = in.nextInt();
            if (guess2 < 0 || guess2 > 12) {
                System.out.println("Error: number must be between 0 and 12, inclusive");
            }
        } while (guess2 < 0 || guess2 > 12);
        System.out.println("The chosen number is: " + guess2);
    }
}