//OOP106 BEDC4

package SavingsAccount;

public class SavingsAccountDemo {
	public static double modifyInterestRate;
	public static SavingsAccount acct1 = new SavingsAccount(2000.00);
	public static SavingsAccount acct2 = new SavingsAccount(3000.00);
	
	public static void main(String[] args) {
		initialCalculate();
		System.out.println("Changing interest reate to 5%\n");
		secondaryCalculate();
		//Test Update 2 Github ArrayList Branch
	}

	private static void initialCalculate() {
		SavingsAccount.modifyInterestRate(0.04);
		
		System.out.println("Account1 initial savings: $" + acct1.toString());
		System.out.println("Account2 initial savings: $" + acct2.toString());
		System.out.println();
		
		
		//Calculate Formula 12 times
		for (int i = 0; i < 12; i++) {
			acct1.calculateMonthlyInterest();
			acct2.calculateMonthlyInterest();
		}
		
		System.out.println("Account1 after 12 months with 4% interest: $" + acct1.toString());
		System.out.println("Account2 after 12 months with 4% interest: $" + acct2.toString());
		System.out.println();
	}

	private static void secondaryCalculate() {
		SavingsAccount.modifyInterestRate(0.05);
		
		
		acct1.calculateMonthlyInterest();
		acct2.calculateMonthlyInterest();
		
		System.out.println("Account1 after 1 months with 5% interest: $" + acct1.toString());
		System.out.println("Account2 after 1 months with 5% interest: $" + acct2.toString());
	}

}
