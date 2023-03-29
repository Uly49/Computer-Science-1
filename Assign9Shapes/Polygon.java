public class Polygon {
    //Class constants
    public static final double DEFAULT_SIDE_LENGTH = 10.0;
    public static final int DEFAULT_SIDE_COUNT = 4;
    
    //Class variables
    private static int count = 0;
    private static int changes = 0;
    
    //Instance variables
    private double length;
    private int sides;
    
    public static int getCount() {
        return count;
    }
    
    public static int getChanges() {
        return changes;
    }
    
    //Constructor
    public Polygon() {
        length = DEFAULT_SIDE_LENGTH;
        sides = DEFAULT_SIDE_COUNT;
        count++;
    }
    
    //Constructor
    Polygon(double sideLength, int numOfSides) {
        this.length = sideLength;
        this.sides = numOfSides;
        count++;
    }
    
    public double getLength() {
        return length;
    }
    
    public int getSides() {
        return sides;
    }
    
    //Sets length
    public void setLength(double theLength) {
        length = theLength;
        changes++;
    }
    
    //Sets number of sides
    public void setSides(int theSides) {
        if (theSides < 3 || theSides > 10) {
            System.out.println("Error: sides must be between 3 and 10");
        }
        else {
            sides = theSides;
            changes++;
        }
    }
    
    public double findPerimeter() {
        double perimeter = length * sides;
        return perimeter;
    }
    
    public double findArea() {
        double area = (sides * Math.pow(length, 2))/(4 * Math.tan(Math.PI/sides));
        return area;
    }
    
    public String toString() {
        if (sides == 3) {
            String formLength = String.format("triangle with 3 sides of length%4.2f", length);
            return formLength;
        }
        else if (sides == 4) {
            String formLength = String.format("square with 4 sides of length %4.2f", length);
            return formLength;
        }
        else if (sides == 5) {
            String formLength = String.format("pentagon with 5 sides of length %4.2f", length);
            return formLength;
        }
        else if (sides == 6) {
            String formLength = String.format("hexagon with 6 sides of length %4.2f", length);
            return formLength;
        }
        else if (sides == 7) {
            String formLength = String.format("heptagon with 7 sides of length %4.2f", length);
            return formLength;
        }
        else if (sides == 8) {
            String formLength = String.format("octagon with 8 sides of length %4.2f", length);
            return formLength;
        }
        else if (sides == 9) {
            String formLength = String.format("nonagon with 9 sides of length %4.2f", length);
            return formLength;
        }
        else {
            String formLength = String.format("decagon with 10 sides of length %4.2f", length);
            return formLength;
        }
    }
    
    public boolean equals() {
        boolean isEqual = false;
        double lengthDiff = Math.abs(length - this.length);
        if ((this.sides == sides) && (lengthDiff < .01)) {
            isEqual = true;
        }
        else {
            isEqual = false;
        }
        return isEqual;
    }
}