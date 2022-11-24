package LAB_5;

import java.util.Scanner;

public class printPowersOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		printPowersOfN(a, b);
	}
	
	public static void printPowersOfN(double a, double b) {
		for (int i = 0; i <= b; i++) {
			System.out.print(Math.pow(a, i) + " ");
		}
	}

}
