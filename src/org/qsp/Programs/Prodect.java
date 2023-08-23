package org.qsp.Programs;

import java.util.Scanner;

public class Prodect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numer=");
		int n = sc.nextInt();

		int pro = 1;
		while (n > 0) {
			int r = n % 10;
			pro = pro * r;
			n = n / 10;
		}
		System.out.println("given product value" + pro);
	}
}
