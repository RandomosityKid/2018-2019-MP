package MP;


import java.util.Scanner;
public class OOP106_DateBDemo {
	public static int monthInt, day, year, daysInYear;
	public static String monthString;
	public static OOP106_DateB datee = new OOP106_DateB();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Month: ");
		monthString = sc.next();
		
		System.out.println("Enter Day: ");
		day = sc.nextInt();
		
		System.out.println("Enter Year: ");
		year = sc.nextInt();
		
		System.out.println("");
		
		monthToInt();
		System.out.println(datee.format(monthInt, day, year));
		System.out.println(datee.format(monthString, day, year));
//		System.out.println(datee.format(day, year));
	}
	
	public static void monthToInt() {
		if (monthString.equalsIgnoreCase("january")) {
			monthInt = 1;
		}
		if (monthString.equalsIgnoreCase("february")) {
			monthInt = 2;
		}
		if (monthString.equalsIgnoreCase("march")) {
			monthInt = 3;
		}
		if (monthString.equalsIgnoreCase("april")) {
			monthInt = 4;
		}
		if (monthString.equalsIgnoreCase("may")) {
			monthInt = 5;
		}
		if (monthString.equalsIgnoreCase("june")) {
			monthInt = 6;
		}
		if (monthString.equalsIgnoreCase("july")) {
			monthInt = 7;
		}
		if (monthString.equalsIgnoreCase("august")) {
			monthInt = 8;
		}
		if (monthString.equalsIgnoreCase("september")) {
			monthInt = 9;
		}
		if (monthString.equalsIgnoreCase("october")) {
			monthInt = 10;
		}
		if (monthString.equalsIgnoreCase("november")) {
			monthInt = 11;
		}
		if (monthString.equalsIgnoreCase("december")) {
			monthInt = 12;
		}
	}
	
	public static void daysInYear() {
		
	}
}
