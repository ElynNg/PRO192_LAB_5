package LAB_5;

import java.util.Scanner;

public class sphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		System.out.println(sphereVolume(r));
	}

	public static double sphereVolume(double r) {
		return Math.PI * Math.pow(r, 3) * 4/3;
	}
	
}
