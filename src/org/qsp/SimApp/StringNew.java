package org.qsp.SimApp;

public class StringNew {
	public static void main(String[] args) {
		String s1 = "jaybal";
		boolean b = false;

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch == 'b' || ch == 'B') {
				b = true;
			}
		}
		if (b == true) {
			System.out.println("B or b present");
		} else
			System.out.println("b or B not present");

	}
}
