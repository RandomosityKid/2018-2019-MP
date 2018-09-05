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
		
		//Always have program running unless told otherwise
		while(true){
			System.out.println("\nEnter Command(type 'help' for commands):");
			choice = sc.next();
			
			switch(choice){
				case "help":
					System.out.println("Commands:\n________________________\n");
					System.out.print("create\ncalculate\nprint\nremove\nexit");
					break;
				case "create":
					System.out.println("Enter full name (no spaces): ");
					choice = sc.next();
					System.out.println("Enter initial Savings Balance: ");
					initialSavings = sc.nextDouble();
					
					SavingsAccount createSA = new SavingsAccount();
					createSA.setFullName(choice);
					createSA.setSavingsBalance(initialSavings);
					list.add(createSA);
//					System.out.println(list);
					break;
				case "calculate":
					
					break;
				case "print":
					System.out.println("Print one account or print all? [one/all]: ");
					choice = sc.next();
					
					switch(choice){
						case "one":
							System.out.println("Enter account name(no spaces): ");
							choice = sc.next();
							
							printAcct = new SavingsAccount();
							for (int i = 1; i < list.size(); i++) {
								if(list.get(i).getFullName().equals(choice)){
									System.out.println("Account" + i + ": " + printAcct.toString());
									break;
								}
							}
							break;
						case "all":
							System.out.println();
							for (int i = 1; i < list.size(); i++) {
								System.out.println(list.get(i));
							}
							break;
					}
					break;
				case "remove":
					System.out.println("Enter account name(no spaces): ");
							choice = sc.next();
							
							printAcct = new SavingsAccount();
							for (int i = 1; i < list.size(); i++) {
								if(list.get(i).getFullName().equals(choice)){
									list.remove(i);
									break;
								}
							}
					break;
				case "exit":
					System.exit(0);
			}
		}
	}


}
