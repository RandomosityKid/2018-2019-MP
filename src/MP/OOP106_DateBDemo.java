package MP;


import java.util.Scanner;
public class OOP106_DateBDemo {
	
	public static void main(String[] args) {
		OOP106_DateB d1 = new OOP106_DateB(11, 13, 2017);
        OOP106_DateB d2 = new OOP106_DateB("February", 29, 1988);
        OOP106_DateB d3 = new OOP106_DateB(317, 2016);
		
		System.out.println("Format 1: MM/DD/YYYY:");
		System.out.println(d1.format1());
		System.out.println(d2.format1());
		System.out.println(d3.format1());
		
//		System.out.println("Format 2: Month DD, YYYY:\n");
//		System.out.println(d1.format1());
//		System.out.println(d2.format1());
//		System.out.println(d3.format1());
//		
//		System.out.println("Format 3: DDD YYYY:\n");
//		System.out.println(d1.format1());
//		System.out.println(d2.format1());
//		System.out.println(d3.format1());
	}
	
	
}
