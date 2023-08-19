package temperature;
import java.util.Scanner;

public class temperatureconverterapp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of fahrenheit to convert to Celsius");
		double Fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
	    double temp = temperatureConverter.convertFahrenheitToCelsius(Fahrenheit);
		System.out.println(temp);
				
	}

}
