// CSCI-241:  Assignment #9
//
// DO NOT HAND THIS CLASS INTO CANVAS
// Uncomment lines when you are ready to test
// the associated methods.
// Use this to test your Polygon class.
// TestPolygon tests all methods in the Polygon class.

public class TestPolygon
{  
    public static void main(String[] args) {
        // Step 1
        Polygon poly1 = new Polygon();

        // Step 2
        System.out.println("Polygon 1:");
        printInstanceVariables(poly1);

        // Step 3
        printCalculations(poly1);

        // skip a line for clearer output
        System.out.println();

        // Step 4
        printClassVariables();

        // Step 5
        Polygon poly2 = new Polygon(15.123, 10);

        // Step 6
        System.out.println("Polygon 2:");        
        printCalculations(poly2);

        // Step 7
        printClassVariables();

        // Step 8 - will cause no change
        poly2.setSides(11);

        // Step 9
        printCalculations(poly2);

        // Step 10
        printClassVariables();

        // Step 11
        poly2.setSides(poly2.getSides()-1);
        System.out.println("After side decrement, poly2 = " + poly2);

        // Step 12 - reset back to original
        poly2.setSides(poly2.getSides()+1);
        System.out.println("After side increment, poly2 = " + poly2);

        // Step 13 
        printIfEqual(poly1,poly2);

        // Step 14
        poly1.setLength(15.129);

        // Step 15
        poly1.setSides(poly1.getSides()+1);

        // Step 16
        System.out.println("Step 15: " + poly1);

        // Step 17
        poly1.setSides(10);
        
        // Step 18
        System.out.println("Step 17: " + poly1);

        // Step 19
        printInstanceVariables(poly2);

        // // Step 20
        printCalculations(poly2);

        // // Step 21
        printIfEqual(poly1,poly2);

        // // Step 22
        printClassVariables();

        // // Step 23
        printClassConstants();
    }

    // print instance variables for the polygon
    public static void printInstanceVariables(Polygon obj)    {
        System.out.printf("length = %7.2f\n",obj.getLength());
        System.out.printf("sides = %2d\n",obj.getSides());  
    }

    // print calculated values for a polygon, and use toString()
    public static void printCalculations(Polygon obj) {
        System.out.printf("area = %7.2f\n",obj.findArea());
        System.out.printf("perimeter = %7.2f\n",
            obj.findPerimeter());
        System.out.println(obj);
        System.out.println();
    }

    // print values of class variables
    public static void printClassVariables()    {
        System.out.println("Class variables:");
        System.out.println(Polygon.getCount() 
            + " polygons created");
        System.out.println(Polygon.getChanges()
            + " length/sides changes"); 
        System.out.println();                        
    }

    // print values of class constants
    public static void printClassConstants()    {
        System.out.println("Class constants:");
        System.out.println("Default side length = " 
            + Polygon.DEFAULT_SIDE_LENGTH);
        System.out.println("Default # of sides = " 
            + Polygon.DEFAULT_SIDE_COUNT);                    
    }

    // see if rectangle is a square, and print related message
    public static void printIfEqual(Polygon poly1, Polygon poly2) {
        System.out.println("Before checking equals(), print polygons");
        System.out.println("poly1: " + poly1);
        System.out.println("poly2: " + poly2);
        if (poly1.equals(poly2))
            System.out.println("Polygons are equal.");
        else
            System.out.println("Polygons are NOT equal.");        
    }
}