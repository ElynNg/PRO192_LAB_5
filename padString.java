package LAB_5;

import java.util.Scanner;

public class padString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int n = input.nextInt();
		System.out.println(padString(s, n));
	}
	
	public static String padString(String s, int n) {
		if (s.length() == n) {
			return s;
		}
		else {
			String temp ="";
			for (int i = 0; i < n-s.length()-1;i++) {
				temp += " ";
			}
			temp+=s;
			return temp;
		}
	}

}
