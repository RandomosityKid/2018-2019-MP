package Rectangle;

import java.util.Scanner;
public class RectangleDemo {
	
	public static double length;
	public static double width;
	public static Rectangle rect = new Rectangle();
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		input();
		output();
	}

	private static void input() {
		System.out.println("Enter Length between 0.0 - 20.0: ");
		length = sc.nextDouble();
		rect.setLength(length);
		
		System.out.println("Enter Width between 0.0 - 20.0: ");
		width = sc.nextDouble();
		rect.setLength(width);
	}

	private static void output() {
		System.out.println(rect.toString());
		System.out.println("Perimeter is: " + rect.computePerimeter());
		System.out.println("Area is: " + rect.computeArea());
	}
}
