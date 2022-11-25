package LAB_5;

import java.util.Scanner;

public class largestAbsVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println(largestAbsVal(a, b, c));
	}

	public static int largestAbsVal(int a, int b, int c) {
		return Math.max(Math.abs(a), Math.max(Math.abs(b), Math.abs(c)));
	}
	
}
