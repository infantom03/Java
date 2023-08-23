package org.qsp.SimApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====Welcome=====");
		System.out.print("Enter the Name=");
		String name = sc.next();
		System.out.print("Enter the eid=");
		int eid = sc.nextInt();
		System.out.print("Enter the salary=");
		double salary = sc.nextDouble();
		Employee e1 = new Employee(name, eid, salary);
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		a1.add(e1);
		for (int i = 0; i < args.length; i++) {
		}
	}
}
