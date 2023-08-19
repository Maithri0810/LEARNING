package demo4;
import java.util.Scanner;
public class joinStrings {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your  Firstname and Lastname");
		String firstName=scan.next();
		String lastName=scan.next();
		System.out.println(joinStrings(firstName,lastName));
		
		
		// TODO Auto-generated method stub

	}
	public static String joinStrings(String str1, String str2) {
		return str1+str2;
	}

}
