package temperature;

public class TemperatureConverter {
	public double convertFahrenheitToCelsius(double Fahrenheit) {
		double celsius=(Fahrenheit - 32) * 5/9;
		return celsius;
	}

}
