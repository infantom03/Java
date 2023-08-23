package org.qsp.SimApp;

public class A {
	public static void main(String[] args) {
		String s1 = "Infant Tom";
		char[] ch = s1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 89) {
				System.out.println(ch[i]);
			}
		}
	}
}