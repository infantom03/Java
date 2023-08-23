package org.qsp.Programs;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number=");
		int i = sc.nextInt();
		
		int t=i;
		int rev = 0;
		while (i > 0) {
			int r = i % 10;
			rev = rev * 10 + r;
			i = i / 10;
		}
		System.out.println(t + " rev is " + rev);
	}
}
