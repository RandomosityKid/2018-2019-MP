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
		datee.setMonthStr(monthString);
		
		System.out.println("Enter Day: ");
		day = sc.nextInt();
		datee.setDay(day);
		
		System.out.println("Enter Year: ");
		year = sc.nextInt();
		datee.setYear(year);
		
		datee.calculate();
		System.out.println("");
		
		
		datee.format1();
		datee.format2();
		datee.format3();
		
	}
}
