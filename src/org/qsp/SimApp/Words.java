package org.qsp.SimApp;

public class Words {
	public static void main(String[] args) {
		String s1 = "hi how are you";
		int count = 0;
		String[] s2 = s1.split(" ");

		for (int i = 0; i < s2.length; i++) {
			count++;
		}
		System.out.println(count);
	}
}
