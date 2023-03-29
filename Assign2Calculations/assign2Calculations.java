/*
 * Ulysses Palomar (palomar)
 * Course:  CSCI-241 - Computer Science I
 * Section 001
 * Assignment: 2
 */
/* Project/Class Description:
 * This program asks the user for prices on items
 * ordered from a restaurant menu.  It assumes that
 * two people are sharing a meal.  It will also
 * calculate a tip.
 * 
 * Known Bugs:  Too many to count ...
 */
import java.util.Scanner;

public class assign2Calculations {
    public static void main(String[] args) {
    // associate a Scanner with the keyboard
    Scanner keyboard = new Scanner(System.in);
    
    // Explain the program to the user
    System.out.print("Welcome!  This program will help you ");
    System.out.println("split your dinner check for 2.");
    System.out.print("It will ask you for the prices of ");
    System.out.println("all your dinner items,one at a time.");
    System.out.print("At the end, it will show you the");
    System.out.println("cost of each meal with 15% or 20% tip.");
          
    // Ask for today's date
    System.out.println("Enter today's month number: ");
    double month = keyboard.nextDouble();
    System.out.println("Enter the number of today's day: ");
    double day = keyboard.nextDouble();
    
    // ask user for the appetizer cost
    System.out.println("Enter cost of appetizer (enter 0 if none): ");
    double appetizer = keyboard.nextDouble();
    
    // since appetizer is for 2 people, find individual person's cost
    double appetizerEach = appetizer / 2.0;
    
    // print cost per person for appetizer
    System.out.println("Cost of appetizer per person = $" + appetizerEach);
    
    // ask for drink prices
    System.out.println("Enter price of drink #1:  ");
    double drink1 = keyboard.nextDouble();       
    System.out.println("Enter price of drink #2:  ");
    double drink2 = keyboard.nextDouble();       
    
    // ask for entree prices
    System.out.println("Enter price of entree #1:  ") ;
    double entree1 = keyboard.nextDouble();       
    System.out.println("Enter price of entree #2:  ");
    double entree2 = keyboard.nextDouble();  
    
    // ask for dessert prices
    System.out.print("Enter price of dessert #1 ");
    System.out.println("(type 0 if no dessert ordered):  ");
    double dessert1 = keyboard.nextDouble();
    System.out.print("Enter price of dessert #2 ");
    System.out.println("(type 0 if no dessert ordered):  ");
    double dessert2 = keyboard.nextDouble();
    
    // find totals for each person
    double total1 = appetizerEach + drink1 + entree1 + dessert1;
    double total2 = appetizerEach + drink2 + entree2 + dessert2;
    
    // find out the tax ammount (5.5% tax)
    double tax1 = total1 * .055;
    double tax2 = total2 * .055;
    
    // find out tip amounts - print both 15% and 20%
    double tipOne15 = total1 * .15;
    double tipOne20 = total1 * .20;
    double tipTwo15 = total2 * .15;
    double tipTwo20 = total2 * .20;
    
    // find totals for each person with tip and tax;
    double total1AndTip15AndTax1 = total1 + tipOne15 + tax1;
    double total1AndTip20AndTax1 = total1 + tipOne20 + tax1;
    
    double total2AndTip15AndTax2 = total2 + tipTwo15 + tax2;
    double total2AndTip20AndTax2 = total2 + tipTwo20 + tax2;
    
    // round totals for each person
    double roundedTotal1AndTip15AndTax1 = ((int)((total1AndTip15AndTax1 + 0.005) * 100)) / 100.0;
    double roundedTotal1AndTip20AndTax1 = ((int)((total1AndTip20AndTax1 + 0.005) * 100)) / 100.0;
    
    double roundedTotal2AndTip15AndTax2 = ((int)((total2AndTip15AndTax2 + 0.005) * 100)) / 100.0;
    double roundedTotal2AndTip20AndTax2 = ((int)((total2AndTip20AndTax2 + 0.005) * 100)) / 100.0;

    // print results for each person
    System.out.print("First total (with tip and tax) is either ");
    System.out.println("$" + roundedTotal1AndTip15AndTax1 + " or $" + roundedTotal1AndTip20AndTax1);
    System.out.print("Second total (with tip and tax) is either ");
    System.out.println("$" + roundedTotal2AndTip15AndTax2 + " or $" + roundedTotal2AndTip20AndTax2);
    }
}