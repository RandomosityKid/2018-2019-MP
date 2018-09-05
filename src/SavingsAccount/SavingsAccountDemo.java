package SavingsAccount;

import java.util.Scanner;
import java.util.ArrayList;

public class SavingsAccountDemo {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<SavingsAccount> list = new ArrayList<SavingsAccount>();
	public static String choice = "masterChoice";
	public static double initialSavings = 0.0;
	public static double modifyInterestRate = 0.0;
	public static SavingsAccount printAcct = new SavingsAccount();
	
	public static void main(String[] args) {
		//Fix array number sync
		SavingsAccount zero = new SavingsAccount();
		list.add(zero); //so new entry is #1, not #0
		
		//Always have program running unless *told otherwise*
		while(true){
			System.out.println("\nEnter Command(type 'help' for commands):");
			choice = sc.next();
			
			switch(choice){
				case "help":
					help();
					break;
				case "create":
					create();
					break;
				case "calculate":
					calculate();
					break;
				case "print":
					print();
					break;
				case "remove":
					remove();
					break;
				case "exit": //*told otherwise*
					System.exit(0);
			}
		}
	}
	
	public static void help() {
		System.out.println("Commands:\n________________________\n");
		System.out.print("create\ncalculate\nprint\nremove\nexit");
	}
	
	public static void create(){
		System.out.println("Enter full name (no spaces): ");
		try {
			choice = sc.next();
		} catch (Exception e) {
			System.out.println("Invalid name!");
			System.exit(0);
		}
		
		System.out.println("Enter initial Savings Balance: ");
		initialSavings = sc.nextDouble();

		SavingsAccount createSA = new SavingsAccount();
		createSA.setFullName(choice);
		createSA.setSavingsBalance(initialSavings);
		
		list.add(createSA);
		System.out.println("Calculation complete!");
//					System.out.println(list);
	}
	
	public static void calculate() {
		System.out.println("Enter account name(no spaces): ");
		choice = sc.next();
		System.out.println("Enter interest rate: ");
		modifyInterestRate = sc.nextDouble();
		System.out.println("For how many months?: ");
		int months = sc.nextInt();
		
		SavingsAccount.modifyInterestRate(modifyInterestRate);
		boolean lost = true;
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i).getFullName().equals(choice)){
				
				//multiply the months
				for (int j = 0; j < months; j++) {
					list.get(i).calculateMonthlyInterest();
//					System.out.println(list.get(i));	//show Process
				}
				lost = false;
				System.out.println("Calculation complete!");
				break;
			}
		}
		if(lost)
			System.out.println("Account not found.");
	}
	
	public static void print(){
		System.out.println("Print one account or print all? [one/all]: ");
		choice = sc.next();

		switch(choice){
			case "one":
				printOne();
				break;
			case "all":
				printAll();
				break;
		}
	}
	
	public static void printOne(){
		System.out.println("Enter account name(no spaces): ");
		choice = sc.next();
		boolean lost = true;

		for (int i = 1; i < list.size(); i++) {
			if(list.get(i).getFullName().equals(choice)){
				System.out.println(list.get(i));
				lost = false;
				break; //break from printOne forLoop
			}
		}
		if(lost)
			System.out.println("Account not found.");
	}
	
	public static void printAll(){
		System.out.println();
		for (int i = 1; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static void remove(){
		System.out.println("Enter account name(no spaces): ");
		choice = sc.next();
		boolean lost = true;

		for (int i = 1; i < list.size(); i++) {
			if(list.get(i).getFullName().equals(choice)){
				list.remove(i);
				lost = false;
				System.out.println("Removal complete!");
				break;
			}
		}
		if(lost)
			System.out.println("Account not found.");
	}
}
