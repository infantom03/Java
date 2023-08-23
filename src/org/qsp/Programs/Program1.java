package org.qsp.Programs;

import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number=");
		int i = sc.nextInt();

		int ld = i % 10;
		int ld1 = i / 10;
		int sum = ld + ld1 + ld * ld1;
		if (sum == i) {
			System.out.println("number is spcial tow digit Number");
		} else
			System.out.println("number is not a spcial tow digit Number");
	}
}
