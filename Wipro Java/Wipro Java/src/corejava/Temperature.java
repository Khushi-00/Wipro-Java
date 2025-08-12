package corejava;

public class Temperature {
	
	private double celsius;

    public void setCelsius(double celsius) {
        if (celsius >= -273.15) { 
            this.celsius = celsius;
        } else {
            System.out.println("Invalid temperature! Celsius cannot be below -273.15°C.");
            this.celsius = -273.15; 
        }
    }
    
    // Method to get current Celsius temperature
    public double getCelsius() {
        return celsius;
    }

    // Convert to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Convert to Kelvin
    public double toKelvin() {
        return celsius + 273.15;
    }

    public void displayTemperatures() {
        System.out.println("Temperature in Celsius: " + getCelsius() + "°C");
        System.out.println("Temperature in Fahrenheit: " + toFahrenheit() + "°F");
        System.out.println("Temperature in Kelvin: " + toKelvin() + " K");
        System.out.println("----------------------------------");
    }

	public static void main(String[] args) {
		Temperature temp1 = new Temperature();
        temp1.setCelsius(25); // Valid temperature
        temp1.displayTemperatures();

        Temperature temp2 = new Temperature();
        temp2.setCelsius(-300); // Invalid temperature (below absolute zero)
        temp2.displayTemperatures();

	}

}
