package LAB_5;

import java.util.Scanner;

public class quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		System.out.println("First root: " + firstRoot(a, b, c));
		System.out.println("Second root: " + secondRoot(a, b, c));
	}
	
	public static double firstRoot(double a, double b, double c) {
		return (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
	}

	public static double secondRoot(double a, double b, double c) {
		return (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
	}
}
