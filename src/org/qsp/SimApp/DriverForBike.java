package org.qsp.SimApp;

public class DriverForBike {
	public static void main(String[] args) {
		Bike b1=new Bike("TVS",30,50000.0);
		Bike b2=new Bike("Xl",40,70000.0);
		
		Bike[] b= {b1,b2};
		for (int i = 0; i < b.length; i++) {
		System.out.println("name :"+b[i].name);
		System.out.println("mileage :"+b[i].mileage);
		System.out.println("price :"+b[i].price);
		System.out.println("======================");
		}
	}
}
