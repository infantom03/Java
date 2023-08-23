package org.qsp.Programs;

import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number=");
		double side=sc.nextDouble();
		double area=side*side;
		double perimeter=4*side;
		
		System.out.println(side);
		System.out.println(area);
		System.out.println(perimeter);
	}
}
