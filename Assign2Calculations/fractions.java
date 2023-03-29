/**
 * Name: Ulysses Palomar (palomar)
 * Course: CSCI 241 – Computer Science I
 * Assignment: 2
 *
 * Project/Class Description:
 * This program will ask for each part of 2 fractions
 * (first numerator, then denominator), and will
 * calculate and print the values from adding
 * the 2 fractions and then multiplying the 2 fractions.
 *
 * Known bugs:
 * none
 */

import java.util.Scanner;

class fractions {
    public static void fractions(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("This program will ask for each part");
        System.out.println("of 2 fractions (first numerator, then");
        System.out.println("denominator), and will calculate and");
        System.out.println("print the values from adding the 2");
        System.out.println("fractions and then multiplying the");
        System.out.println("2 fractions.");
        
        //Ask for the numerators and denominators
        System.out.println("Enter numerator 1 integer:");
        int num1 = keyboard.nextInt();
        System.out.println("Enter denominator 1 integer:");
        int den1 = keyboard.nextInt();
        System.out.println("Enter numerator 2 integer:");
        int num2 = keyboard.nextInt();
        System.out.println("Enter denominator 2 integer:");
        int den2 = keyboard.nextInt();
        
        //calculate fraction 1 decimal
        double decimal1 = (num1*1.0) / (den1*1.0);
        
        //calculate fraction 2 decimal
        double decimal2 = (num2*1.0) / (den2*1.0);
        
        //print fraction 1 as decimal
        System.out.println("             " + num1);
        System.out.println("Fraction 1: --- = " + decimal1);
        System.out.println("             " + den1);
        
        //space between fractions
        System.out.println();
        System.out.println();
        
        //print fraction 2 as deciaml
        System.out.println("             " + num2);
        System.out.println("Fraction 2: --- = " + decimal2);
        System.out.println("             " + den2);
        
        //calculate numerator and denominator of the sum of both fractions
        int sumNum = (num1*den2) + (den1*num2);
        int sumDen = den1*den2;
        
        //calculate decimal of sum of fractions
        double sumDec = (sumNum*1.0)/(sumDen*1.0);
        
        //calculate numerator and denominator of product of both fractions
        int prodNum = num1*num2;
        int prodDen = den1*den2;
        
        //calculate decimal of product of fractions
        double prodDec = (prodNum*1.0)/(prodDen*1.0);
        
        //space between fractions and sum
        System.out.println();
        System.out.println();
        
        //print sum of fractions
        System.out.println(" " + num1 + "     " + num2 + "     " + sumNum);
        System.out.println("--- + --- = --- = " + sumDec);
        System.out.println(" " + den1 + "     " + den2 + "     " + sumDen);
        
        //space between sum and product decimals
        System.out.println();
        System.out.println();
        
        //print product of fractions
        System.out.println(" " + num1 + "     " + num2 + "     " + prodNum);
        System.out.println("--- x --- = --- = " + prodDec);
        System.out.println(" " + den1 + "     " + den2 + "     " + prodDen);
    }
}