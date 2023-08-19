package journeyCalculator4;
import java.util.Scanner;

public class calculatorapp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter speed and Time To Clculate Distance");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator=new JourneyCalculator();
		double distance=journeyCalculator.calculatorDistance(speed,time);
		System.out.println(distance);
		
		
			
		}

}
