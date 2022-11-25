package LAB_5;

import java.util.Scanner;

public class lastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(lastDigit(n));
		
	}
	
	public static int lastDigit(int n) {
		return Math.abs(n%10);
	}

}
