package MP;

public class OOP106_Date {
	public static String format;
	public static int day, year, monthInt;
	public static String monthStr;
	public static String[] monthArray = {
		"", "January", "February", "March", "April", "May", "June",
		"July", "August", "September", "October", "November", "December"
	};
	public int daysInMonths[] = {
		0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	
	public OOP106_Date(){
		
	}
	
	public static String format(int month, int day, int year) {
		monthToInt(monthStr);
		format = String.format("%2d/%2d/%4d", month, day, year);
		return format;
	}
	
	public static String format(String month, int day, int year) {
		return null;
	}
	
	public static int format(int daysInYear, int year) {
		return 0;
	}
	
	public static void monthToInt(String monthString) {
		
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
	
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 400 == 0) || (year % 100 != 0)) {
			return true;
		} else {
			return false;
		}
		
//		Leap Year Conditions:
//		1. Divisible by 4
//		2. Not divisible by 100 OR divisible by 400
//		
//		Ex. 
//		if (year % 4 != 0) {
//			return false;
//		} else if (year % 400 == 0) {
//			return true;
//		} else if (year % 100 == 0) {
//			return false;
//		} else {
//			return false;
//		}
	}

	public static void setDay(int day) {
		OOP106_Date.day = day;
	}

	public static void setYear(int year) {
		OOP106_Date.year = year;
	}

	public static void setMonthInt(int monthInt) {
		OOP106_Date.monthInt = monthInt;
	}

	public static void setMonthStr(String monthStr) {
		OOP106_Date.monthStr = monthStr;
	}
		
	
}
