package MP.Inheritance;

public class OOP106_SavingsAccount extends OOP106_Account{
	
	private double interest;

	public OOP106_SavingsAccount(int accnum) {
		super(accnum);
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest/100;
	}
	
	@Override
	public void withdraw(double amount) {
		if (amount < getBalance())
			setBal(getBalance() - amount);
		else
			System.out.println("You don't have that much in your account.");
	}
}
