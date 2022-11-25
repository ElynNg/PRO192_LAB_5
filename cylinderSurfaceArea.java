package LAB_5;

import java.util.Scanner;

public class cylinderSurfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double height = input.nextDouble();
		System.out.println(cylinderSurfaceArea(radius, height));
	}

	public static double cylinderSurfaceArea(double r, double h) {
		return 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;
	}
	
}
