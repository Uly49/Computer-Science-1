/**
 * Name: Ulysses Palomar (palomar)
 * Course: CSCI 241 - Computer Science I
 * Assignment: 4
 * 
 * Project/Class Description:
 * This program will calculate postage for 3 types of items.
 * 
 * Known bugs:
 * none
 * 
 */
import java.util.*;

public class PostageCalc
{
    public static void main (String [ ] args)
    {
        System.out.println("Welcome to the Postage Calculator Program"); 
        System.out.println("This program will calculate postage "
                         + "for items up to 2 pounds.");
        System.out.println("------------------------------------"
                         + "-------------------------");
        System.out.println();
        
        // set up Scanner to get keyboard input
        Scanner keyboard = new Scanner (System.in);

        for (int i = 0; i < 5; i++) {            
            double cost = 0.0;  // holds cost of mailing
            boolean heavy = false; // will determine if item is too heavy to ship
            boolean invalidItem = false; // will determine if item is valid
            System.out.println("You can choose postcard, letter, or parcel.");
            System.out.print ("Type the kind of item you wish to send: ");
            String item = keyboard.next();
            
            if (item.equals("postcard")) {
                System.out.print("Enter the width of the postcard: ");
                double width = keyboard.nextDouble(); // holds width of postcard
                System.out.print("Enter the height of the postcard: ");
                double height = keyboard.nextDouble(); // holds height of postcard
                if (width > 6 || height > 4.25) {
                    cost = .55;
                }
                
                if (!(width > 6) && !(height > 4.25)) {
                    cost = .36;
                }
            }
            
            if (item.equals("letter")) {
                System.out.print("Enter the weight in ounces: ");
                double weight = keyboard.nextDouble(); // holds weight of letter
                if (weight <= 1) {
                    cost = .55;
                }
                
                if (weight > 1) {
                    cost = .55 + ((weight - 1) * .20);
                }
            }
            
            if (item.equals("parcel")) {
                System.out.print("Enter the weight in pounds: ");
                double weight = keyboard.nextDouble(); // holds weight of parcel
                System.out.print("Enter the zone (0 for local): ");
                int zone = keyboard.nextInt(); // holds zone parcel is being shipped to
                if (weight > 2) {
                    heavy = true;
                }
                
                if (weight <= 1) {
                    if (zone >= 0 && zone <= 2) {
                        cost = 7.70;
                    }
                    
                    if (zone == 3) {
                        cost = 8.10;
                    }
                    
                    if (zone == 4) {
                        cost = 8.25;
                    }
                    
                    if (zone == 5) {
                        cost = 8.40;
                    }
                    
                    if (zone == 6) {
                        cost = 8.70;
                    }
                    
                    if (zone == 7) {
                        cost = 8.95;
                    }
                    
                    if (zone == 8 || zone == 9) {
                        cost = 9.55;
                    }
                }
                
                if (1 < weight && weight <= 2) {
                    if (zone >= 0 && zone <= 2) {
                        cost = 8.55;
                    }
                    
                    if (zone == 3) {
                        cost = 8.85;
                    }
                    
                    if (zone == 4) {
                        cost = 10.10;
                    }
                    
                    if (zone == 5) {
                        cost = 10.95;
                    }
                    
                    if (zone == 6) {
                        cost = 11.75;
                    }
                    
                    if (zone == 7) {
                        cost = 12.75;
                    }
                    
                    if (zone == 8 || zone == 9) {
                        cost = 13.80;
                    }
                }
            }
            
            if (!item.equals("postcard") && !item.equals("letter") && !item.equals("parcel")) {
                invalidItem = true; // if inalid item is entered, invalidItem gets turned true
            }
            
            if (invalidItem) {
                System.out.println("Can't mail this type of item."); // prints this if invalid item is entered
            }
            
            if (heavy) {
                System.out.println("Package too heavy - try another program."); // prints this if item is too heavy
            }
            
            if (!heavy && !invalidItem) {
                System.out.printf("Cost of mailing your " + item + " is $ %.2f\n", cost); // prints this if item is valid and not too heavy
            }
            
            System.out.println(); // empty line before next item
        }
    }
}
