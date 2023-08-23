package org.qsp.Programs;

import java.util.Scanner;

public class DayMonthYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day=");
		int d = sc.nextInt();
		System.out.print("Enter the month=");
		int m = sc.nextInt();
		System.out.print("Enter the Year=");
		int y = sc.nextInt();

		if (d < 1 || d > 31 || m < 1 || m > 12 || y < 1) {
			System.out.println("invalid");
		} else if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
			System.out.println("invalid");
		} else if (!(y % 400 == 0 || y % 4 == 0 && y % 100 != 0) && d > 28 && m == 2) {
			System.out.println("invalid");
		} else if ((y % 400 == 0 || y % 4 == 0 && y % 100 != 0) && d > 29 && m == 2) {
			System.out.println("invalid");
		} else
			System.out.println("valid");
	}
}
