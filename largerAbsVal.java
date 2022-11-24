package LAB_5;

import java.util.Scanner;

public class largerAbsVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(largerAbsVal(a, b));
		
	}
	
	public static int largerAbsVal(int a, int b) {
		return Math.max(Math.abs(a), Math.abs(b));
	}

}
