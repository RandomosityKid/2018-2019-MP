package MP;

public class OOP106_DateB {
	public String format;
	public int day, year, monthInt, daysYearFormat;
	public String monthStr;
	public int[] date = new int[4];
	public String[] monthArray = {
		"", "January", "February", "March", "April", "May", "June",
		"July", "August", "September", "October", "November", "December"
	};
	public int daysInMonths[] = {
		0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	
	
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
	
	public String format1() {
		return String.format("%02d/%02d/%04d", date[1], date[2], date[3]);
	}
	public String format2(){
		return String.format("%s %02d, %04d", monthArray[date[1]], date[2], date[3]);
	}
	public String format3(){
		return String.format("%03d %04d", getDaysYearFormat(), date[3]);
	}
	
	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 400 == 0) || (year % 100 != 0));
	/*	Leap Year Conditions:
		1. Divisible by 4
		2. Not divisible by 100 OR divisible by 400
		
		Ex. 
		if (year % 4 != 0) {
			return false;
		} else if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else {
			return false;
		}
	*/
	}

	//Setters
	public void setDay(int day) {
		date[2] = day;
	}
	public void setYear(int year) {
		date[3] = year;
	}
	public void setMonthStr(String monthStr) {
		for (int month = 1; month < monthArray.length; month++) {
			if (monthStr.equalsIgnoreCase(monthArray[month])) {
				date[1] = month;
			}
		}
	}
	public void setMonthInt(int monthInt) {
		date[1] = monthInt;
	}
	public void setDaysYearFormat(int daysYearFormat) {
		daysInMonths[2] = (isLeapYear(year) ? 29 : 28);
		int month = 1;
		while(daysYearFormat > daysInMonths[month]){
            daysYearFormat -= daysInMonths[month];
            month++;
        }
		setMonthInt(month);
		setDay(daysYearFormat);
	}

	//Getters
	public int getYear() {
		return year;
	}
	public int getDaysYearFormat() {
		int tempDay = 0;
		for (int month = 1; month < date[1]; month++) {
			tempDay += daysInMonths[month];
		}
		return tempDay + date[2];
	}
}