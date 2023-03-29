/*
 * This class tests the Thermometer class's instance variables.
 * 
 * Written by: Stuart Hansen
 * Date: October 1, 2002
 * 
 * Known Bugs: none
 */

public class InstanceTest
{
     public static void main (String [] args)
     {
          // Create some thermometers
          System.out.println
            ("Creating two thermometers at -273.15 and 0 degrees Celsius");
          Thermometer t1 = new Thermometer(-273.15); // set to -273.15 C
          Thermometer t2 = new Thermometer();    // set to 0 C
          System.out.println();

          // Get the temperature readings on t1 and t2
          System.out.println ("t1 reads " + t1.getCelsius() + " Celsius, " + 
                              t1.getFahrenheit() + " Fahrenheit");
          System.out.println ("t2 reads " + t2.getCelsius() + " Celsius, " + 
                              t2.getFahrenheit() + " Fahrenheit");
          System.out.println();

          // Change their values
          System.out.println("Changing the readings on the two thermometers");
          t1.setTemperatureUsingCelsius(100);
          t2.setTemperatureUsingFahrenheit(212);

          // Get the temperature readings on t1 and t2
          System.out.println ("t1 reads " + t1.getCelsius() + " Celsius, " + 
                              t1.getFahrenheit() + " Fahrenheit");
          System.out.println ("t2 reads " + t2.getCelsius() + " Celsius, " + 
                              t2.getFahrenheit() + " Fahrenheit");
          System.out.println();

          System.out.println("Thermometer test suite finished...");
     }
}