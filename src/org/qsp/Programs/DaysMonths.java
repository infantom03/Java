package org.qsp.Programs;

import java.util.Scanner;

public class DaysMonths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Month=");
		int a = sc.nextInt();

		if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
			System.out.println("31 days present in the " + a + " month");
		} else if (a == 4 || a == 6 || a == 9 || a == 11) {
			System.out.println("30 days present in the" + a + " month");
		} else
			System.out.println("28(or)29 present");
	}
}
