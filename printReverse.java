package LAB_5;

import java.util.Scanner;

public class printReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		for (int i = s.length()-1; i >= 0 ; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
