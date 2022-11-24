package LAB_5;

import java.util.Scanner;

public class printPowersOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		double n = input.nextDouble();
		printPowersOf2(n);
	}
	
	public static void printPowersOf2(double n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(Math.pow(2, i) + " ");
		}
	}

}
