package LAB_5;

import java.util.Scanner;

public class processName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your full name: ");
		String name = input.next();
		String lastName = input.next();
		System.out.println("Your name in reverse order is " + lastName + ", " + name);
	}

}
