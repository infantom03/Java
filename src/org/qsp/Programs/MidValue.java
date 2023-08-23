package org.qsp.Programs;

import java.util.Scanner;
public class MidValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the a =");
		int x=sc.nextInt();
		System.out.print("Enter the b =");
		int y=sc.nextInt();
		System.out.print("Enter the c =");
		int z=sc.nextInt();
		
		if (x>y && x<z || x<y && x>z) {
			System.out.println("x is the mid");
		}
		else if (y>z && y<x || y<z && y>x) {
			System.out.println("y is the mid");
		}
		else
			System.out.println("z id the mid");
	}
}
