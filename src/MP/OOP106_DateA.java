package MP;

public class OOP106_DateA {
	public static int day, year, monthInt;
	public static String monthStr;
	public static String[] monthArray = {
		"", "January", "February", "March", "April", "May", "June",
		"July", "August", "September", "October", "November", "December"
	};
	public int daysInMonths[] = {
		0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	
	public OOP106_DateA(){
	}

	public static void format1() {
		System.out.printf("%02d/%02d/%04d", monthInt, day, year);
	}
	
	public static void format2() {
		for (int check = 1; check < monthArray.length; check++) {
			if (monthStr.equalsIgnoreCase(monthArray[check])) {
				monthStr = monthArray[check];
				break;
			}
		}
		System.out.printf(monthStr +" %02d, %04d", day, year);
	}
	
	public static void format3() {
		
	}

	
	
	public static void calculate(){
		monthToInt(monthStr);
		daysInYear();
	}
	
	private static void monthToInt(String monthStr) {
		for (int check = 1; check < monthArray.length; check++) {
			if (monthStr.equalsIgnoreCase(monthArray[check])) {
				monthInt = check;
			}
		}
	}

	private static void daysInYear() {
		
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
}
