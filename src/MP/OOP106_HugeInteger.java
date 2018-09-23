package MP;

public class OOP106_HugeInteger {
	public static int[] intArray = new int[40];
	public static int integerLength;
	
	public OOP106_HugeInteger(){
		
	}
	
	public static void parse(String numbersHiding) {
		String integerStr = "";
		
		//Parse digits in string
		for (int numlength = 0; numlength < numbersHiding.length(); numlength++) {
			Character n = numbersHiding.charAt(numlength);
			if (Character.isDigit(n)) {
				integerStr += n;
			}
		}
		
		//Check if string passes integer size
		integerLength = (integerStr.length() > intArray.length) ? intArray.length : integerStr.length();
		
		//Adding to array
		int n = 0;
		
		for (int i = 40 - integerLength; i < 40; i++) {
			intArray[i] = integerStr.charAt(n++) - 48;
		}
	}
	
	public static void add() {
		
	}
	
	public static void subtract() {
		
	}

	@Override
	public String toString() {
		
		return super.toString(); //To change body of generated methods, choose Tools | Templates.
	}
	
	public static void isEqualTo() {
		
	}
	
	public static void isNotEqualTo() {
		
	}
	
	public static void isGreaterThan() {
		
	}
	
	public static void isLessThan() {
		
	}
	
	public static void isGreaterThanOrEqualTo() {
		
	}
	
	public static void isLessThanOrEqualTo() {
		
	}
	
	public static void multiply() {
		
	}
	
	public static void divide() {
		
	}
	
	public static void remainder() {
		
	}
	
}
