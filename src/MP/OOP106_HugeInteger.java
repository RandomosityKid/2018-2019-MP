package MP;

public class OOP106_HugeInteger {
	public int[] intArray = new int[40];
	public int integerLength; //Remove extra 0's
	
	//Default Constructor
	public OOP106_HugeInteger(){
	}
	
	//Gives Identity (Makes sure referenced HI isn't the same)
	public OOP106_HugeInteger(int[] intArray){
        this.intArray = intArray;
    }
	
	public int getLength(){
        return this.integerLength;
    }
	
	public int[] getHugeInteger(){
        return intArray;
    }
	
	OOP106_HugeInteger(String integer){
		parse(integer);
	}
	
	public void parse(String numbersHiding) {
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
	
	public static boolean isEqualTo(OOP106_HugeInteger hi1, OOP106_HugeInteger hi2) {
		int[] tmp1 = hi1.getHugeInteger();
        int[] tmp2 = hi2.getHugeInteger();

        for(int i=0; i<40; i++){
//			System.out.println(tmp1[i] + ", " + tmp2[i]);
            if(tmp1[i] != tmp2[i]){
				
                return false;
			}
        }
        return true;
	}
	
	public static boolean isNotEqualTo(OOP106_HugeInteger hi1, OOP106_HugeInteger hi2){
		return !isEqualTo(hi1, hi2);
	}
	
	public static OOP106_HugeInteger add(OOP106_HugeInteger hi1, OOP106_HugeInteger hi2) {
		int[] i1 = hi1.getHugeInteger();
        int[] i2 = hi2.getHugeInteger();
        String myString = "";

        //Remove redundant math
        int trimmedNum = (hi1.getLength() > hi2.getLength()) ? hi1.getLength() : hi2.getLength();

        for(int i=40 - trimmedNum; i<40; i++)
            myString += i1[i] + i2[i];
        
        return new OOP106_HugeInteger(myString);
	}
	
	public static OOP106_HugeInteger subtract(OOP106_HugeInteger hi1, OOP106_HugeInteger hi2) {
		int[] i1 = hi1.getHugeInteger();
        int[] i2 = hi2.getHugeInteger();
        String myString = "";

        //Remove redundant math
        int trimmedNum = (hi1.getLength() > hi2.getLength()) ? hi1.getLength() : hi2.getLength();

        for(int i=40 - trimmedNum; i<40; i++)
            myString += i1[i] - i2[i];
        
        return new OOP106_HugeInteger(myString);
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
	
	@Override
	public String toString() {
		return String.format("%s", parseToString());	
}
	
	public String parseToString(){
		String strHugeInteger = "";
		for(int i=40 - integerLength; i<40; i++){
			strHugeInteger += intArray[i];
		}
		return strHugeInteger;
	}
}
