/**
 * Name: Ulysses Palomar (palomar)
 * Assignment: 6
 * 
 * Project/Class Description:
 * This program uses separate class-level methods to print table
 * of prime integers that are also palindromes
 * 
 * Known bugs:
 * none
 */
import java.util.*;

public class PrimePalindromes {
    public static void main (String [] args) {
        
        
        //Explains code to user
        System.out.print("Welcome! This program will ");
        System.out.println("find a chosen number of ");
        System.out.print("prime numbers that ");
        System.out.println("are also palindromes.");
        
        int num = getCount();
        int i = 0;
        int count = 0;
        //System.out.println("The number you entered is: " + num);
        
        while (count < num) {
            if (isPrime(i) && isPalindrome(i)) {
                count++;
                printNum(i, count);
            }
            i++;
        }
    }
    
    // Asks user for number of prime palindromes to print
    public static int getCount() {
        //Sets up scanner
        Scanner in = new Scanner(System.in);
        int num;
        
        System.out.print("How many numbers would");
        System.out.print(" you like to see? ");
        
        do {
            num = in.nextInt();
            if (num < 1 || num > 100) {
                System.out.print("Error: number must be between");
                System.out.print(" 1 and 100.");
            }
        } while (num < 1 || num > 100);
        
        return num;
    }
    
    //Prints the prime palindromes formatted to 7
    //positions with comma and 10 numbers per line
    public static void printNum(int i, int count) {
        System.out.printf("%,7d ", i);
        if (count % 10 == 0) {
            System.out.println();
        }
    }
    //Tests if number is prime
    public static boolean isPrime(int i) {
        if (i < 2) {
            return false;
        }
        else if (i == 2) {
            return true;
        }
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
    //Reverses number (Arithmetic goes from left to right so
    //division, then mod, then multiplication
    public static int findReverse(int i) {
        if (i > 9 && i < 100) {
            int ones = i % 10 * 10;
            int tens = i / 10 % 10;
            int reverse = ones + tens;
            
            return reverse;
        }
        else if (i > 99 && i < 1000) {
            int ones = i % 10 * 100;
            int tens = i / 10 % 10 * 10;
            int hundreds = i / 10 / 10 % 10;
            int reverse = ones + tens + hundreds;
            
            return reverse;
        }
        else if (i > 999 & i < 10000) {
            int ones = i % 10 * 1000;
            int tens = i / 10 % 10 * 100;
            int hundreds = i / 10 / 10 % 10 * 10;
            int thousands = i / 10 / 10 / 10 % 10;
            int reverse = ones + tens + hundreds + thousands;
            
            return reverse;
        }
        else if (i > 9999 && i < 100000) {
            int ones = i % 10 * 10000;
            int tens = i / 10 % 10 * 1000;
            int hundreds = i / 10 / 10 % 10 * 100;
            int thousands = i / 10 / 10 / 10 % 10 * 10;
            int tenThousands = i / 10 / 10 / 10 / 10 % 10;
            int reverse = ones + tens + hundreds + thousands + tenThousands;
            
            return reverse;
        }
        else {
            return i;
        }
    }
    //Tests if number is palindrome
    public static boolean isPalindrome(int i) {
        if (findReverse(i) == i) {
            return true;
        }
        else {
            return false;
        }
    }
}