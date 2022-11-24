package LAB_5;

import java.util.Scanner;

public class printGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		printGrid(a, b);
	}
	
	public static void printGrid(int a, int b) {
		for (int i = 1; i <= a; i++) {
			int temp = i;
			for (int j = 1; j <= b; j++) {
				System.out.print(temp + ", ");
				temp += a;
			}
			System.out.println();
		}
	}

}
