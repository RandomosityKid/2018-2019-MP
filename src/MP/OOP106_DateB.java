package MP;

public class OOP106_DateB {
	public static String format;
	public static int day, year, monthInt, daysYearFormat;
	public static String monthStr;
	public static String[] monthArray = {
		"", "January", "February", "March", "April", "May", "June",
		"July", "August", "September", "October", "November", "December"
	};
	public int daysInMonths[] = {
		0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	
	public static int[] date = new int[3];
	
	
	
	public OOP106_DateB(){
		date[0] = 0;
        date[1] = 1;
        date[2] = 1;
		date[3] = 1;
	}
	
	public OOP106_DateB(int monthInt, int day, int year){
        setYear(year);
        setMonthInt(monthInt);
        setDay(day);
    }
	
	public OOP106_DateB(String monthStr, int day, int year){
        setYear(year);
        setMonthStr(monthStr);
        setDay(day);
    }
	
	public OOP106_DateB(int days, int year){
        setYear(year);
        setDaysYearFormat(days);
    }
	
	public static String format1() {
		format = String.format("%02d/%02d/%04d", date[1], date[2], date[3]);
		return format;
	}
	
	public static String format(String monthStr, int day, int year) {
		for (int i = 1; i < monthArray.length; i++) {
			if (monthStr.equalsIgnoreCase(monthArray[i])) {
				monthStr = monthArray[i];
				break;
			}
		}
		format = String.format(monthStr +" %02d, %04d", day, year);
		return format;
	}
	
	public static int format(int daysInYear, int year) {
		return 0;
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
		OOP106_DateB.day = day;
	}

	public static void setYear(int year) {
		OOP106_DateB.year = year;
	}

	public static void setMonthStr(String monthStr) {
		OOP106_DateB.monthStr = monthStr;
	}

	public static void setMonthInt(int monthInt) {
		OOP106_DateB.monthInt = monthInt;
	}

	public static void setDaysYearFormat(int daysYearFormat) {
		OOP106_DateB.daysYearFormat = daysYearFormat;
	}
	
	
		
	
}
