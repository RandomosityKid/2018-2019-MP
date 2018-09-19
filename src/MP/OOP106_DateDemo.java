package MP;


import java.util.Scanner;
public class OOP106_DateDemo {
	public static int monthint, day, year;
	public static String month;
	public static OOP106_Date datee = new OOP106_Date();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int day, year;
		String month;
		
		System.out.println("Enter Month: ");
		month = sc.next();
		
		System.out.println("Enter Day: ");
		day = sc.nextInt();
		
		System.out.println("Enter Year: ");
		year = sc.nextInt();
		
		System.out.println("");
		
		monthToInt();
		
		
//		System.out.println(datee.format(month, day, year));
//		System.out.println(datee.format(month, day, year));
//		System.out.println(datee.format(day, year));
	}
	
	public static void monthToInt() {
		if (month.equalsIgnoreCase("january")) {
			monthint = 1;
		}
		if (month.equalsIgnoreCase("february")) {
			monthint = 2;
		}
		if (month.equalsIgnoreCase("march")) {
			monthint = 3;
		}
		if (month.equalsIgnoreCase("april")) {
			monthint = 4;
		}
		if (month.equalsIgnoreCase("may")) {
			monthint = 5;
		}
		if (month.equalsIgnoreCase("june")) {
			monthint = 6;
		}
		if (month.equalsIgnoreCase("july")) {
			monthint = 7;
		}
		if (month.equalsIgnoreCase("august")) {
			monthint = 8;
		}
		if (month.equalsIgnoreCase("september")) {
			monthint = 9;
		}
		if (month.equalsIgnoreCase("october")) {
			monthint = 10;
		}
		if (month.equalsIgnoreCase("november")) {
			monthint = 11;
		}
		if (month.equalsIgnoreCase("december")) {
			monthint = 12;
		}
	}
}
