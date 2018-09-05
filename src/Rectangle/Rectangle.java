package Rectangle;

import java.util.Scanner;
public class Rectangle {
	private double length;
	private double width;
	public static Scanner sc = new Scanner(System.in);
	
	
	public Rectangle(){
		
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double length) {
		//To check for valid input
		while(length < 0.0 || length > 20.0){
			System.out.println("Input invalid! Enter number between 0.0 - 20.0: ");
			length = sc.nextDouble();
		}
		this.length = length;
	}

	public void setWidth(double width) {
		//To check for valid input
		while(width < 0.0 || width > 20.0){
			System.out.println("Input invalid! Enter number between 0.0 - 20.0: ");
			width = sc.nextDouble();
		}
		this.width = width;
	}
	
	public double computePerimeter(){
		return 2 * length + 2 * width;
	}
	
	public double computeArea(){
		return length * width;
	}

	@Override
	public String toString() {
		return "\nRectangle{" + "length=" + length + ", width=" + width + '}';
	}
	
	

	
	
}
