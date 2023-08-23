package org.qsp.Programs;

import java.util.Scanner;
public class NpowerP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value=");
		int n=sc.nextInt();
		System.out.println("Enter the P value");
		int p=sc.nextInt();
		
		int pow=1;
		for (int i = 1; i <=p ; i++) {
			pow=pow*n;
		}
		System.out.println(pow);
	}
}
