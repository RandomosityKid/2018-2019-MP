package MP;

import java.util.Date;

class OOP106_AccountBase {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated;
	
	public OOP106_AccountBase(){
	}
	
	public OOP106_AccountBase(int id, double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate/100;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		double MIR = (annualInterestRate/100 / 12);
		return Double.parseDouble(String.format("%10.2f", MIR));
	}
	
	public double getMonthlyInterest() {
		Double MI = balance * getMonthlyInterestRate();
		return Double.parseDouble(String.format("%10.2f", MI));
	}
	
	public void withdraw(double money) {
		if (money > balance) {
			System.out.println("You don't have that much in your account.");
		} else {
			balance -= money;
			System.out.println("\nWithdrew $" + money + "\nCurrent Balance: $" + balance + "\n");
		}
	}
	
	public void deposit(double money) {
		balance += money;
		System.out.println("Deposited $" + money + "\nCurrent Balance: $" + balance + "\n");
	}
}

public class OOP106_Account {
	public static void main(String[] args) {
		OOP106_AccountBase acct1 = new OOP106_AccountBase(1122, 20000);
		acct1.setAnnualInterestRate(4.5);
		
		System.out.println("Account1 Balance: " + acct1.getBalance());
		acct1.withdraw(2500);
		acct1.deposit(3000);
		System.out.println(	"\nAccount1 Balance: " + acct1.getBalance() + 
							"\nAccount1 Monthly Interest:" + acct1.getMonthlyInterest() +
							"\nAccount1 Date created:" + acct1.getDateCreated());
	}
}
