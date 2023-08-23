package org.qsp.Programs;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number=");
		int n = sc.nextInt();

		boolean rs = isSpy(n);
		if (rs == true) {
			System.out.println("spy number");
		} else
			System.out.println("not a spy number");
		sc.close();

	}
	public static boolean isSpy(int n) {
		int sum = 0, pro = 1;
		while (n > 0) {
			int r = n % 10;
			sum = sum + r;
			pro = pro * r;
			n = n / 10;
		}
		return sum == pro;
	}
}
