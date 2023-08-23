package org.qsp.Programs;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Value");
		int b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a swap value is" + a);
		System.out.println("b swap value is" + b);
	}
}
