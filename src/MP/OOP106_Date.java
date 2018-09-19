package MP;

public class OOP106_Date {
	
	public static int day, year, monthInt;
	public static String monthStr;
	public static String[] monthArray = {
		"", "January", "February", "March", "April", "May", "June",
		"July", "August", "September", "October", "November", "December"
	};
	
	public OOP106_Date(){
		
	}
	
	public static String format(int month, int day, int year) {
		return null;
	}
	
	public static String format(String month, int day, int year) {
		return null;
	}
	
	public static int format(int days, int year) {
		return 0;
	}
	
	public static void monthToInt() {
		
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
	
}
