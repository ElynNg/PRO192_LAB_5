package LAB_5;

import java.util.Scanner;

public class printSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int min = input.nextInt();
		int max = input.nextInt();
		printSquare(min, max);
	}
	
	public static void printSquare(int min, int max) {
		for (int i = min; i <= max; i++) {
			for (int j = i; j <= max; j++) {
				System.out.print(j);
			}
			for (int k = min; k < i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
