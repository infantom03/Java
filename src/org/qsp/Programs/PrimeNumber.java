package org.qsp.Programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number=");
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			boolean rs = isPrime(i);
			if (rs==true) {
				System.out.println(i+"prime number");
			}
			else
				System.out.println(i+"not a prime number");
		}
	}
	public static boolean isPrime(int a) {
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		return count == 2;
	}
}