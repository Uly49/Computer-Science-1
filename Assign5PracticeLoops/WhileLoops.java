/**
 * Name: Ulysses Palomar (palomar)
 * Assignment: 4
 * 
 * Project/Class Description:
 * This program will demonstrate 3 examples of while loops
 * 
 * Known bugs:
 * none
 */
import java.util.*;

public class WhileLoops {
    public static void main (String [] args) {
        //Sets up scanner
        Scanner in = new Scanner(System.in);
        
        //Tells user what this first loop does
        System.out.println("          ------ Section A ------");
        System.out.print("(while) Loop runs and places 3 -\\ABC");
        System.out.println("/- symbol patterns");
        System.out.println("        between \"March\" and \"2021\".");
        System.out.print("===================================");
        System.out.println("===================================");
        
        //Prints "March"
        System.out.print("March");
        
        //Start of while loop
        int i = 1;
        while (i < 4) {
            System.out.print("-\\ABC/-");
            i++;
        }
        
        //Prints "2021"
        System.out.println("2021 \n");
        
        //Divider between sections A and B
        System.out.print("-----------------------------------");
        System.out.println("-----------------------------------");
        
        //Tells user what the second loop does
        System.out.println("\n          ------ Section B ------");
        System.out.print("(while) loop asks for positive integers ");
        System.out.println("until you enter 0 or lower.");
        System.out.print("The loop will count the number of ");
        System.out.println("odd and even integers entered.");
        System.out.print("Both counts will be printed after ");
        System.out.println("the loop finishes.");
        System.out.print("===================================");
        System.out.println("===================================");
        
        //Asks user for number
        System.out.print("Enter a positive integer, 0 ");
        System.out.print("or lower to terminate: ");
        int num = in.nextInt();
        int evens = 0;
        int odds = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                evens++;
            }
            else {
                odds++;
            }
            System.out.print("Enter an integer, 0 to terminate: ");
            num = in.nextInt();
        }
        System.out.print("Even numbers entered: ");
        System.out.println(evens);
        System.out.print("Odd numbers entered: ");
        System.out.println(odds);
        
        //Divider between sections B and C
        System.out.print("-----------------------------------");
        System.out.println("-----------------------------------");
        
        //Tells the use user what the third loop does
        System.out.println("\n         ------ Section C ------");
        System.out.print("(while) loop prints 8 through 48, then ");
        System.out.println("48 down to 8, by eights.");
        System.out.print("Each set of numbers appears on its own ");
        System.out.println("line, tab distance apart.");
        System.out.print("===================================");
        System.out.println("===================================");
        
        //variables that help with loop, ending loop, and switching order
        boolean loop = false;
        boolean order = false;
        int start = 8;
        
        //while loop
        while (!loop) {
            if (!order && start <= 40) {
                System.out.print(start + "\t");
                start = start + 8;
            }
            else if (!order && start == 48) {
                System.out.println(start);
                order = true;
            }
            else if (order && start > 0) {
                System.out.print(start + "\t");
                start = start - 8;
            }
            else if (order && start == 0) {
                loop = true;
            }
        }
    }
}