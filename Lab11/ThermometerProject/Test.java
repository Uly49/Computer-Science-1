
/**
 * Test.java
 * 
 * Access the static (class-level) elements
 * in the Thermometer class
 */
public class Test
{
    public static void main(String [] args) {
        // Print the constants from the Thermometer class
        System.out.println("FREEZING_FAHRENHEIT = "
            + Thermometer.FREEZING_FAHRENHEIT );
        System.out.println("FREEZING_CELSIUS = "
            + Thermometer.FREEZING_CELSIUS);
        System.out.println("BOILING_FAHRENHEIT = "
            + Thermometer.BOILING_FAHRENHEIT);
        System.out.println("BOILING_CELSIUS = "
            + Thermometer.BOILING_CELSIUS);
            
        double tempC = 100.0;
        double tempF = 212.0;
        
        System.out.println("100 degrees C = "
                + Thermometer.celsiusToFahrenheit(tempC) + " F");
        System.out.println("212 degrees F = "
                + Thermometer.fahrenheitToCelsius(tempF) + " C");
    }
}
