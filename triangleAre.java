package LAB_5;

import java.util.Scanner;

public class triangleAre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		System.out.println(triangleArea(a, b, c));
	}

	public static double triangleArea(double a, double b, double c) {
		double s = (a + b + c) /2;
		return Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
	
}
