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
	
	public static String format(int monthInt, int day, int year) {
		monthToInt(monthStr);
		format = String.format("%2d/%2d/%4d", monthInt, day, year);
		return format;
	}
	
	public static String format(String monthStr, int day, int year) {
		for (int i = 1; i < monthArray.length; i++) {
			if (monthStr.equalsIgnoreCase(monthArray[i])) {
				monthStr = monthArray[i];
				break;
			}
		}
		format = String.format(monthStr +"%2d, %4d", day, year);
		return format;
	}
	
	public static int format(int daysInYear, int year) {
		return 0;
	}
	
	public static void monthToInt(String monthStr) {
		if (monthStr.equalsIgnoreCase("january")) 
			monthInt = 1;
		if (monthStr.equalsIgnoreCase("february")) 
			monthInt = 2;
		if (monthStr.equalsIgnoreCase("march")) 
			monthInt = 3;
		if (monthStr.equalsIgnoreCase("april")) 
			monthInt = 4;
		if (monthStr.equalsIgnoreCase("may")) 
			monthInt = 5;
		if (monthStr.equalsIgnoreCase("june")) 
			monthInt = 6;
		if (monthStr.equalsIgnoreCase("july")) 
			monthInt = 7;
		if (monthStr.equalsIgnoreCase("august")) 
			monthInt = 8;
		if (monthStr.equalsIgnoreCase("september")) 
			monthInt = 9;
		if (monthStr.equalsIgnoreCase("october")) 
			monthInt = 10;
		if (monthStr.equalsIgnoreCase("november")) 
			monthInt = 11;
		if (monthStr.equalsIgnoreCase("december")) 
			monthInt = 12;
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

	public static void setMonthStr(String monthStr) {
		OOP106_Date.monthStr = monthStr;
	}
		
	
}
