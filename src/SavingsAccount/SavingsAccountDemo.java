package SavingsAccount;

import java.util.Scanner;
import java.util.ArrayList;

public class SavingsAccountDemo {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<SavingsAccount> list = new ArrayList<SavingsAccount>();
	public static String choice = "masterChoice";
	public static double initialSavings = 0.0;
	
	public static void main(String[] args) {
		//Fix array number sync
		SavingsAccount zero = new SavingsAccount("zero", 0.0);
		list.add(zero); //so new entry is #1, not #0
		
		//Always have program running unless told otherwise
		while(true){
			System.out.println("\n\nEnter Command(type 'help' for commands):");
			choice = sc.next();
			
			switch(choice){
				case "help":
					System.out.println("Commands:\n________________________\n");
					System.out.println("create\ncalculate\nprint\nremove\nexit");
					break;
				case "create":
					System.out.println("Enter full name (no spaces): ");
					choice = sc.next();
					System.out.println("Enter initial Savings Balance: ");
					initialSavings = sc.nextDouble();
					SavingsAccount createSA = new SavingsAccount(choice, initialSavings);
					break;
				
					
			}
		}
	}


}
