package org.qsp.Programs;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number=");
		int n = sc.nextInt();

		int even = 0, odd = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		System.out.println("sum of even digit" + even);
		System.out.println("sum lf odd digit" + odd);
	}
}
