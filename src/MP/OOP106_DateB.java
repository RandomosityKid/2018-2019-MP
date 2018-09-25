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
	
	public static int[] date = new int[4];
	
	public OOP106_DateB(){
		date[0] = 0;
        date[1] = 1;
        date[2] = 1;
		date[3] = 1;
	}
	
	public OOP106_DateB(int monthInt, int day, int year){
//        setYear(year);
//        setMonthInt(monthInt);
        setDay(day);
    }
	
	public OOP106_DateB(String monthStr, int day, int year){
//        setYear(year);
        setMonthStr(monthStr);
        setDay(day);
    }
	
//	public OOP106_DateB(int days, int year){
//        setYear(year);
//        setDaysYearFormat(days);
//    }
	
	public String format1() {
		return String.format("%02d/%02d/%04d", date[1], date[2], date[3]);
	}
	
//	public static String format(String monthStr, int day, int year) {
//		for (int i = 1; i < monthArray.length; i++) {
//			if (monthStr.equalsIgnoreCase(monthArray[i])) {
//				monthStr = monthArray[i];
//				break;
//			}
//		}
//		format = String.format(monthStr +" %02d, %04d", day, year);
//		return format;
//	}
	
//	public static int format(int daysInYear, int year) {
//		return 0;
//	}
	
//	public static boolean isLeapYear(int year) {
//		if ((year % 4 == 0) && (year % 400 == 0) || (year % 100 != 0)) {
//			return true;
//		} else {
//			return false;
//		}
//		
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
//	}

	//Setters
	public static void setDay(int day) {
		date[2] = day;
	}

	public static void setYear(int year) {
		date[3] = year;
	}

	public static void setMonthStr(String monthStr) {
		OOP106_DateB.monthStr = monthStr;
	}

	public static void setMonthInt(int monthInt) {
		date[1] = monthInt;
	}

	public static void setDaysYearFormat(int daysYearFormat) {
		OOP106_DateB.daysYearFormat = daysYearFormat;
	}

	public static int getYear() {
		return year;
	}

	public static int date1() {
		return date[2];
	}
	
	public static void returnDate(){
		System.out.println(date[1]+" "+ date[2]+" "+ date[3]);
	}
	
	
		
	
}
