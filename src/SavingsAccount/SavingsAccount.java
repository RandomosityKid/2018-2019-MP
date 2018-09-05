package SavingsAccount;

import java.util.Scanner;

public class SavingsAccount {
	private static double annualInterestRate = 0.0;
	private double savingsBalance = 0.0;
	private String fullName = null;
	public static Scanner sc = new Scanner(System.in);
	
	//Default Constructor
	public SavingsAccount(){
		setFullName("null");
		setSavingsBalance(0.0);
	}
	
	//Method to change Interest Rate
	public static void modifyInterestRate(double newInterestRate){
		//Check for negative interest input
		while(newInterestRate < 0.0){
			System.out.println("Invalid input! Interest rate should be greater than 0.0: ");
			newInterestRate = sc.nextDouble();
		}
		annualInterestRate = newInterestRate;
	}
	
	//Method to calculate amount
	public void calculateMonthlyInterest(){
		savingsBalance += (savingsBalance + annualInterestRate) / 12;
	}

	@Override
	public String toString() {
		return String.format(fullName + ": $%.2f", getSavingsBalance());
	}
	
	

	//Getters/Setters
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public String getFullName() {
		return fullName;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
