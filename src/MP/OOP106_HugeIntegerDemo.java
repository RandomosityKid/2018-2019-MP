package MP;

public class OOP106_HugeIntegerDemo {
	public static void main(String[] args) {
		OOP106_HugeInteger i1 = new OOP106_HugeInteger("H2741el953l53o099");
		OOP106_HugeInteger i2 = new OOP106_HugeInteger("H2741e953l53o089");
		
		System.out.println("Integer1 = " + i1.toString());
		System.out.println("Integer2 = " + i2.toString());
		System.out.println("isEqualTo " + OOP106_HugeInteger.isEqualTo(i1, i2));
	}
}
