package org.qsp.Programs;

import java.util.Scanner;
public class SmallestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the Number=");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		if (x<y && x<z) {
			System.out.println(x+"is the smallest Number");
		}
		else if(y<x)
			System.out.println(y+"is the smallest Number");
		else
			System.out.println(z+"is the smallest Number");
	}
}
