package LAB_5;

import java.util.Scanner;

public class pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double salary = input.nextDouble();
		int hours = input.nextInt();
		System.out.println("salary: " + pay(salary, hours));
	}
	
	public static double pay(double s, int h) {
		if (h > 8) {
			return (s * 8) + (1.5 * s * (h - 8));
		}
		else {
			return s * h;
		}
	}

}
