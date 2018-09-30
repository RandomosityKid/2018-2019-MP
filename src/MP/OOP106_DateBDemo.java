package MP;

public class OOP106_DateBDemo {
	
	public static void main(String[] args) {
		OOP106_DateB d1 = new OOP106_DateB(06, 18, 1995);
        OOP106_DateB d2 = new OOP106_DateB("November", 14, 2009);
        OOP106_DateB d3 = new OOP106_DateB(150, 2121);
		
		System.out.println("\nFormat 1: MM/DD/YYYY:");
		System.out.println(d1.format1());
		System.out.println(d2.format1());
		System.out.println(d3.format1());
		
		System.out.println("\nFormat 2: Month DD, YYYY:");
		System.out.println(d1.format2());
		System.out.println(d2.format2());
		System.out.println(d3.format2());
		
		System.out.println("\nFormat 3: DDD YYYY:");
		System.out.println(d1.format3());
		System.out.println(d2.format3());
		System.out.println(d3.format3());
	}
}
