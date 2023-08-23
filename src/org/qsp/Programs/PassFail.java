package org.qsp.Programs;

import java.util.Scanner;

public class PassFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter tamil mark=");
		int a = sc.nextInt();
		System.out.println("Enter Englis mark=");
		int b = sc.nextInt();
		System.out.println("Entet maths Mark=");
		int c = sc.nextInt();

		if (a > 35 && b > 35 && c > 35) {
			System.out.println("Student is Pass");
		} else
			System.out.println("Student is fail");
	}
}
