package Stopwatch;

import java.util.Scanner;

public class StopWatchDemo {
	public static StopWatch watch1 = new StopWatch();
	public static Scanner sc = new Scanner(System.in);
	public static String choice;
	
	public static void main(String[] args) {
		while(true){
			System.out.println("Enter Function: ");
			choice = sc.next();
			
			if(choice.equals("start")){
				watch1.start();
				System.out.println();
			}
			if(choice.equals("stop")){
				watch1.stop();
				System.out.println(watch1.getElapsedTime() + " milliseconds\n");
			}
			if(choice.equals("exit")){
				System.exit(0);
			}
			
		}
	}
	
	
}
