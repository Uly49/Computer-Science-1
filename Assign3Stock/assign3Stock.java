/*
 * Ulysses Palomar (palomar)
 * Course: CSCI-241 - Computer Science 1
 * Section 001
 * Assignment 3
 */
/*
 * Project/Class Description:
 * This program will report a stock price
 * in historic format using eighths, as well
 * as the current value of the holding.
 */
import java.util.Scanner;

public class assign3Stock {
    public static void main(String[] args) {
        // associate a Scanner with the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // explain the program to the user
        System.out.println("Welcome to Ye Olde Stock Report!");
        System.out.println("----------------------------------");
        System.out.println("This program will report a stock price");
        System.out.println("in historic format using eighths, as well");
        System.out.println("as the current value of the holding.");
        System.out.println();
        
        // ask user for name of company
        System.out.println("Enter a company name: ");
        String companyName = keyboard.nextLine();
        
        // ask user for price of stock
        System.out.println("Enter the price of the stock: ");
        double stockPrice = keyboard.nextDouble();
        
        //ask user for number of shares
        System.out.println("Enter the number of shares held: ");
        int numberOfShares = keyboard.nextInt();
        
        //calculate stock price in historic format
        double newStockPrice = stockPrice*1000000;
        int stockDollar = (int)newStockPrice/1000000;
        int stockDollarRemainder = (int)newStockPrice%1000000;
        int stockEighths = (int)stockDollarRemainder/125000;
        int stockEighthsRemainder = (int)stockDollarRemainder%125000;
        int stockSixteenths = (int)stockEighthsRemainder/62500;
        int stockSixteenthsRemainder = (int)stockEighthsRemainder%62500;
        int stockThirtySeconds = (int)stockSixteenthsRemainder/31250;
        int stockThirtySecondsRemainder = (int)stockSixteenthsRemainder%31250;
        int stockSixtyFourths = (int)stockThirtySecondsRemainder/15625;
        int stockSixtyFourthsRemainder = (int)stockThirtySecondsRemainder%15625;
        
        //calculate total value of stock shares
        double stockValue = ((int)(((stockPrice*numberOfShares)+0.005)*100))/100.0;
        
        //display stock report
        System.out.println("=========================================");
        System.out.println("Report for " + companyName);
        System.out.println("-----------------------------------------");
        System.out.println("Current stock quote value: $" + stockPrice);
        System.out.print("'Old' stock quote value: $" + stockDollar);
        System.out.print(" " + stockEighths + "/8 " + stockSixteenths);
        System.out.print("/16 " + stockThirtySeconds + "/32 ");
        System.out.println(stockSixtyFourths + "/64");
        System.out.println("Total value of stock shares: $" + stockValue);
    }
}