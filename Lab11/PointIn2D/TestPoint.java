/**
 *  Name: Erica Eddy
 *  Course: CSCI 241 - Computer Science I
 *  Section: 001 or 002
 *  Assignment: 1
 *
 *  Project/Class Description
 *     This program tests the Point class methods added in Lab09
 *
 *  Known Bugs:
 *     none
 */

public class TestPoint
{
    public static void main (String [] args)
    {
        // Read in the first (x, y) pair
        Point p1 = new Point();
        p1.readFromKeyboard();
        
        // Read in the second (x, y) pair
        Point p2 = new Point();
        p2.readFromKeyboard();
        
        // Check if p1 and p2 are equal
        // if (p1 == p2) compares their memory addresses
        if (p1.equals(p2))
            System.out.println("p1 and p2 are the same point.");
        else
            System.out.println("p1 and p2 are different points.");
            
        // Find the distance
        double distance = p1.distanceTo(p2);
        
        // Display the result
        System.out.println ("The distance from " + p1.toString() + " to "
                   + p2.toString() + " is " + distance);
                   
        Point p3 = p1.findMidpoint(p2);
        System.out.println("Using the instance method, the midpoint between "
                   + "p1 and p2 is " + p3);
                   
        Point p4 = new Point();
        Point.findMidpoint(p1,p2,p4);
        System.out.println("Using the class method, the midpoint between "
                   + "p1 and p2 is " + p4);
    }        
}
