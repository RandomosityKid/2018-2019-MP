package MP.Inheritance;

public class OOP106_CurrentAccount extends OOP106_Account{
	
	private double overdraftLimit;

	public OOP106_CurrentAccount(int a) {
		super(a);
		overdraftLimit = -200;
	}
	
	public OOP106_CurrentAccount(int accnum, double overdraftLimit) {
		super(accnum);
		this.overdraftLimit = overdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) 
			setBal(getBalance() - amount);
		else
			System.out.println("The amount exceeds the overdraft limit.");
	}

}
