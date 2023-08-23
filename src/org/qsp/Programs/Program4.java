package org.qsp.Programs;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number=");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int big = a;
		if (b > big) {
			big = b;
		}
		if (c > big) {
			big = c;
		}
		System.out.println("The bigest Number is"+big);
	}
}
