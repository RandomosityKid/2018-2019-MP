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
		for (int month = 1; month < daysInMonths.length; month++) {
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
