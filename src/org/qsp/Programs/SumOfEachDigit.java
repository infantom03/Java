package org.qsp.Programs;

import java.util.Scanner;

public class SumOfEachDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number=");
		int n = sc.nextInt();

		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println("sum of the Given value" + sum);
	}
}
