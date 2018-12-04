package MP;

public class OOP106_HugeIntegerDemo {
	public static void main(String[] args) {
		OOP106_HugeInteger i1 = new OOP106_HugeInteger("H2741el953l53o089");
		OOP106_HugeInteger i2 = new OOP106_HugeInteger("H2741e953l53o089");
//		OOP106_HugeInteger i3 = new OOP106_HugeInteger("2016159");
		
		System.out.println("Integer1 = " + i1.toString());
		System.out.println("Integer2 = " + i2.toString());
//		System.out.println("Integer3 = " + i3.toString());

		//Equality Check
		System.out.println("\nisEqualTo: " + OOP106_HugeInteger.isEqualTo(i1, i2));
		System.out.println("isnotEqualTo: " + OOP106_HugeInteger.isNotEqualTo(i1, i2));
		
		//Math
		System.out.println("\naddition: " + OOP106_HugeInteger.add(i1, i2));
		System.out.println("subtraction: " + OOP106_HugeInteger.add(i1, i2));
	}
}
