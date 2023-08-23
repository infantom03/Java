package org.qsp.Programs;

import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number=");
		double redious=sc.nextDouble();
		double area=3.14*redious*redious;
		double circum=2*3.14*redious;
		
		System.out.println(redious);
		System.out.println(area);
		System.out.println(circum);
	}
}
