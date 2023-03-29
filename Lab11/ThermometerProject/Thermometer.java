public class Thermometer
{
    // class variables, constants
    private static final double  DEGREE_RATIO        = 1.8;
    public static final  double  FREEZING_FAHRENHEIT = 32.0;
    public static final  double  FREEZING_CELSIUS    = 0.0;
    public static final  double  BOILING_FAHRENHEIT  = 212.0;
    public static final  double  BOILING_CELSIUS     = 100.0;

    // class methods
    // Write the class (static) methods here
    public static double celsiusToFahrenheit(double celsius) {
        double degreesF = celsius * DEGREE_RATIO + FREEZING_FAHRENHEIT;
        return degreesF;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        double degreesC = (fahrenheit - FREEZING_FAHRENHEIT)/DEGREE_RATIO;
        return degreesC;
    }
    
    // instance variable
    // current temperature (in celsius)
    private double currentTemperature;  
    
    // WRITE THE CONSTRUCTORS FOR CHECKPOINT #3
    public Thermometer() {
        currentTemperature = 0.0;
    }
    
    public Thermometer(double degreesC) {
        currentTemperature = degreesC;
    }
    // instance methods
    
    // getCelsius
    public double getCelsius()
    {
        return currentTemperature;
    }

    // getFahrenheit
    public double getFahrenheit()
    {
        // REPLACE THIS LINE FOR CHECKPOINT #3
       double degreesF 
          = celsiusToFahrenheit(currentTemperature);
       return degreesF;
    }

    // set temperature using Celsius
    public void setTemperatureUsingCelsius (double degreesC)
    {
        currentTemperature = degreesC;   
    }
    
    // set temperature using Celsius
    public void setTemperatureUsingFahrenheit (double degreesF)
    {        
        // WRITE THE BODY OF THE METHOD FOR CHECKPOINT #3
        currentTemperature  = fahrenheitToCelsius(degreesF);  
    }
}