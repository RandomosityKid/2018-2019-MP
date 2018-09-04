//OOP106 Masterbranch3

package SavingsAccount;

public class SavingsAccountDemo {
	public static double modifyInterestRate;
	public static SavingsAccount acct1 = new SavingsAccount(2000.00);
	public static SavingsAccount acct2 = new SavingsAccount(3000.00);
	public static double oldcAcct1;
	public static double oldcAcct2;
	public static double newcAcct1;
	public static double newcAcct2;
	
	public static void main(String[] args) {
		initialCalculate();
		System.out.println("Changing interest reate to 5%\n");
		secondaryCalculate();
		//Test Update 2 Github Masterfile
	}

	private static void initialCalculate() {
		SavingsAccount.modifyInterestRate(0.04);
		
		System.out.println("Account1 initial savings: $" + acct1.toString());
		System.out.println("Account2 initial savings: $" + acct2.toString());
		System.out.println();
		
		//Save old Account
		oldcAcct1 = acct1.getSavingsBalance();
		oldcAcct2 = acct2.getSavingsBalance();
		
		//Calculate Formula 12 times
		for (int i = 0; i < 12; i++) {
			acct1.calculateMonthlyInterest();
			acct2.calculateMonthlyInterest();
		}
		
		System.out.println("Account1 after 12 months with 4% interest: $" + acct1.toString());
		System.out.println("Account2 after 12 months with 4% interest: $" + acct2.toString());
		seeDifference();
		System.out.println();
	}

	private static void secondaryCalculate() {
		SavingsAccount.modifyInterestRate(0.05);
		
		//Save old Account
		oldcAcct1 = acct1.getSavingsBalance();
		oldcAcct2 = acct2.getSavingsBalance();
		
		acct1.calculateMonthlyInterest();
		acct2.calculateMonthlyInterest();
		
		System.out.println("Account1 after 1 months with 5% interest: $" + acct1.toString());
		System.out.println("Account2 after 1 months with 5% interest: $" + acct2.toString());
		seeDifference();
	}

	private static void seeDifference() {
		newcAcct1 = acct1.getSavingsBalance() - oldcAcct1;
		newcAcct2 = acct2.getSavingsBalance() - oldcAcct2;
		System.out.printf("Acct1 Increased by; $%.2f\n", newcAcct1);
		System.out.printf("Acct2 Increased by; $%.2f\n", newcAcct2);
	}
}
