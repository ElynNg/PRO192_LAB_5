package LAB_5;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = input.nextFloat();
		System.out.println("A area of a circle: " + area(radius));
	}
	
	public static double area(double r) {
		return Math.PI * Math.pow(r, 2);
	}
	
}
