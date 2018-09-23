package MP;

public class OOP106_DateA {
	public static int day, year, monthInt, dayAsYear;
	public static String monthStr;
	public static boolean isLeapYear;
	public static String[] monthArray = {
		"", "January", "February", "March", "April", "May", "June",
		"July", "August", "September", "October", "November", "December"
	};
	public static int daysInMonths[] = {
		0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	
	public OOP106_DateA(){
	}

	public static void format1() {
		System.out.printf("%02d/%02d/%04d\n", monthInt, day, year);
	}
	
	public  void format2() {
		for (int check = 1; check < monthArray.length; check++) {
			if (monthStr.equalsIgnoreCase(monthArray[check])) {
				monthStr = monthArray[check];
				break;
			}
		}
		System.out.printf(monthStr +" %02d, %04d\n", day, year);
	}
	
	public static void format3() {
		System.out.printf("%03d %04d\n", dayAsYear, year);
	}

	
	
	
	public static void calculate(){
//		checkMonth();
//		checkDay();
//		checkYear();
		monthToInt(monthStr);
		februaryFix();
		daysInYear();
	}
	
	private static void monthToInt(String monthStr) {
//		switch(monthStr){
//			case "january":
//				monthInt = 1;
//				break;
//			case "february":
//				monthInt = 2;
//				break;
//			case "march":
//				monthInt = 3;
//				break;
//			case "april":
//				monthInt = 4;
//				break;
//			case "may":
//				monthInt = 5;
//				break;
//			case "june":
//				monthInt = 6;
//				break;
//			case "july":
//				monthInt = 7;
//				break;
//			case "august":
//				monthInt = 8;
//				break;
//			case "september":
//				monthInt = 9;
//				break;
//			case "october":
//				monthInt = 10;
//				break;
//			case "november":
//				monthInt = 11;
//				break;
//			case "december":
//				monthInt = 12;
//				break;
//		}
		
		for (int check = 1; check < monthArray.length; check++) {
			if (monthStr.equalsIgnoreCase(monthArray[check])) {
				monthInt = check;
			}
		}
	}
	
	public static void februaryFix() {
		if (isLeapYear) 
			daysInMonths[2] = 29;
	}
	
	private static void daysInYear() {
//		switch (monthStr) {
//			case "january":
//				dayAsYear += day;
//				break;
//			case "february":
//				dayAsYear = 31;
//				dayAsYear += daysInMonths[2];
//				break;
//			case "march":
//				dayAsYear = 59;
//				dayAsYear += day;
//				break;
//			case "april":
//				dayAsYear = 90;
//				dayAsYear += day;
//				break;
//			case "may":
//				dayAsYear = 120;
//				dayAsYear += day;
//				break;
//			case "june":
//				dayAsYear = 151;
//				dayAsYear += day;
//				break;
//			case "july":
//				dayAsYear = 181;
//				dayAsYear += day;
//				break;
//			case "august":
//				dayAsYear = 212;
//				dayAsYear += day;
//				break;
//			case "september":
//				dayAsYear = 243;
//				dayAsYear += day;
//				break;
//			case "october":
//				dayAsYear = 273;
//				dayAsYear += day;
//				break;
//			case "november":
//				dayAsYear = 304;
//				dayAsYear += day;
//				break;
//			case "december":
//				dayAsYear = 334;
//				dayAsYear += day;
//				break;
//			default:
//				break;
//		}
		
		for (int month = 1; month <= daysInMonths.length; month++) {
			dayAsYear += daysInMonths[month];
//			System.out.println(dayAsYear);
			if ((monthStr.equalsIgnoreCase(monthArray[month]))){
				dayAsYear -= (daysInMonths[month] - day);
				break;
			}
		}
	}
	
	public static void isLeapYear() {
		isLeapYear = (year % 4 == 0) && (year % 400 == 0) || (year % 100 != 0);
	}

	public static int getYear() {
		return year;
	}

	public static String getMonthStr() {
		return monthStr;
	}

	public static int getMonthInt() {
		return monthInt;
	}

	public static boolean isIsLeapYear() {
		return isLeapYear;
	}
	
	public static void setDay(int day) {
		OOP106_DateA.day = day;
	}
	
	public static void setYear(int year) {
		OOP106_DateA.year = year;
	}

	public static void setMonthStr(String monthStr) {
		OOP106_DateA.monthStr = monthStr;
	}

	public static void setMonthInt(int monthInt) {
		OOP106_DateA.monthInt = monthInt;
	}
}
