package MP;

import java.util.Date;

public class OOP106_Account {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated;
	
	public OOP106_Account(){
	
	}
	
	public OOP106_Account(int id, double balance){
		this.id = id;
		this.balance = balance;
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
		this.annualInterestRate = annualInterestRate;
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
			System.out.println("Withdrew $" + money + "\n Current Balance: $" + balance + "\n");
		}
	}
	
	public void deposit(double money) {
		balance += money;
		System.out.println("Deposited $" + money + "\n Current Balance: $" + balance + "\n");
	}
}
