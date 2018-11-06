package MP;

public class OOP106_HugeIntegerDemo {
	public static void main(String[] args) {
		OOP106_HugeInteger i1 = new OOP106_HugeInteger("H2341el323l53o0");
		OOP106_HugeInteger i2 = new OOP106_HugeInteger("H2341e323l53o099");
		
		System.out.println(i1.toString());
		System.out.println("isEqualTo " + OOP106_HugeInteger.isEqualTo(i1, i2));
	}
}
