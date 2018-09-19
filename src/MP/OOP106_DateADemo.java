package MP;

import java.util.Scanner;
public class OOP106_DateADemo {
	public static int day, year;
	public static String monthString;
	public static OOP106_DateA datee = new OOP106_DateA();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Month: ");
		monthString = sc.next();
		
		System.out.println("Enter Day: ");
		day = sc.nextInt();
		
		System.out.println("Enter Year: ");
		year = sc.nextInt();
		
		
		System.out.println("");
		
	}
}
