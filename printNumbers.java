package LAB_5;

import java.util.Scanner;

public class printNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printNumbers(n);
	}
	
	public static void printNumbers(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.print("[" + i +"]");
		}
	}

}
