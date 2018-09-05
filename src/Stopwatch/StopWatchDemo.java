package Stopwatch;

import java.util.Scanner;

public class StopWatchDemo {
	public static StopWatch watch1 = new StopWatch();
	public static Scanner sc = new Scanner(System.in);
	public static String choice;
	
	public static void main(String[] args) {
		while(true){
			System.out.println("\nEnter Function: ");
			choice = sc.next();
			
			if(choice.equals("start")){
				watch1.start();
			}
			if(choice.equals("stop")){
				watch1.stop();
				System.out.println(watch1.getElapsedTime() + " milliseconds");
			}
			if(choice.equals("exit")){
				System.exit(0);
			}
			
		}
	}
	
	
}
