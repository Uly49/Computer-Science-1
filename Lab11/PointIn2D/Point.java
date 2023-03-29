/**
 * Class Point
 * Written by: Stuart Hansen
 * Date: September 20, 2003
 * 
 * Purpose:
 *    This class provides various routines to
 *    manipulate points in the coordinate plane (x, y).
 *    
 * Known bugs:
 *    none
 */
import java.util.*;

public class Point
{
    //----------------------------------
    //    Data Members
    //----------------------------------  
    /**
     * The x coordinate of a point
     */
    private double xCoord;

    /**
     * The y coordinate of a point
     */
    private double yCoord;

    //----------------------------------
    //    Constructors
    //----------------------------------

    /*
     * This constructor initializes the point to (initX, initY)
     */
    public Point (double initX, double initY)    {
        xCoord = initX;
        yCoord = initY;
    }

    /**
     * The default constructor initializes the point to (0, 0)
     */
    public Point ()    {
        this(0.0,0.0);
    }

    //-------------------------------------------------
    //      Public Methods:
    // 
    //          double getX ();
    //          double getY ();
    //          void setX(double);
    //          void setY(double);
    //          String toString ();
    //          double distanceToOrigin();
    //          double distanceTo (Point);
    //          void   readFromKeyboard();
    //------------------------------------------------

    /**
     * Returns the x-coordinate of a point
     * 
     * @return the x-coordinate of this point
     */
    public double getX ()      {
        return xCoord;
    }

    /**
     * Returns the y-coordinate of a point
     * 
     * @return the y-coordinate of this point
     */
    public double getY ()      {
        return yCoord;
    }

    /**
     * Changes the x-coordinate of a point
     * @param   xValue, the new value of the x-coordinate
     */
    public void setX(double xValue)
    {
        xCoord = xValue;
    }

    /**
     * Changes the y-coordinate of a point
     * @param   yValue, the new value of the y-coordinate
     */
    public void setY(double yValue)
    {
        yCoord = yValue;
    }

    /**
     * Returns a String representing the point
     */
    public String toString()        {
        return "(" + xCoord + ", " + yCoord + ")";
    }

    /**
     * Returns the distance to the origin
     */
    public double distanceToOrigin()    {
        return Math.sqrt(xCoord*xCoord + yCoord*yCoord);
    }

    /**
     * Reads in the coordinates from the keyboard
     */
    public void readFromKeyboard()    {
        // Read in an (x, y) pair
        Scanner in = new Scanner(System.in);
        System.out.print ("What is the X value?  ");
        xCoord = in.nextDouble();

        System.out.print ("What is the Y value?  ");
        yCoord = in.nextDouble();

        System.out.println();
    }

    /**
     * Returns the distance between parameter point and this one
     */
    public double distanceTo(double xCoordParam, double yCoordParam)
    {
        double xDiff = xCoord - xCoordParam;
        double yDiff = yCoord - yCoordParam;

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    /**
     * Returns the distance between parameter point and this one
     */
    public double distanceTo(Point p2)    {
        //  REPLACE THIS CODE FOR CHECKPOINT #4
        double xDiff = xCoord - p2.getX();
        double yDiff = yCoord - p2.yCoord;

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    /**
     * Determines if the current object and the parameter are equal
     */
    // WRITE THE equals(Point) METHOD HERE FOR CHECKPOINT #4
    public boolean equals(Point q) {
        boolean isEqual = false;
        double closeX = Math.abs(xCoord - q.xCoord);
        double closeY = Math.abs(yCoord - q.yCoord);
        if (closeX < 0.0001 && closeY < 0.0001)
            isEqual = true;
        return isEqual;
    }

    /**
     * Calculate the midpoint between two points and return it
     */
    // WRITE YOUR findMidpoint(Point) METHOD HERE FOR CHECKPOINT #5
    public Point findMidpoint(Point p2) {
        double x = (xCoord + p2.getX())/2;
        //double x = (xCoord + p2.xCoord)/2;
        double y = (yCoord + p2.yCoord)/2;
        Point mid = new Point(x,y);
        return mid;
    }

    /**
     * Static method to calculate the midpoint and save it in the 3rd parameter
     * Problem:  it doesn't work!
     */
    public static void findMidpoint(Point a, Point b, Point mid)
    {
        double x = (a.xCoord + b.xCoord)/2;
        double y = (a.yCoord + b.yCoord)/2;       
        //mid = new Point (x,y);
        mid.setX(x);
        // mid.setY(y);
        mid.yCoord = y;
    }    
}