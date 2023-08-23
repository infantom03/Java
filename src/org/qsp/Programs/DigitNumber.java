package org.qsp.Programs;

import java.util.Scanner;

public class DigitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number=");
		int a = sc.nextInt();

		if (a >= -9 && a <= 9) {
			System.out.println("Number is digit");
		} else
			System.out.println("number is not a digit");
	}
}
