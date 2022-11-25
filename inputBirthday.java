package LAB_5;

import java.util.Scanner;

public class inputBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("On what day of the month were you born? ");
		int day = input.nextInt();
		System.out.println();
		System.out.print("What is the name of the month in which you were born? ");
		String month = input.next();
		System.out.println();
		System.out.print("During what year you were born? ");
		int year = input.nextInt();
		System.out.println();
		System.out.println("You were born on " + month + " " + day + ", " + year +". You're mighty old!");
	}

}
