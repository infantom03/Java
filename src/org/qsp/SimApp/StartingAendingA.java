package org.qsp.SimApp;

public class StartingAendingA {
	public static void main(String[] args) {
		String s1 = "we are area appa ayya";
		String[] s2 = s1.split(" ");// we,are,area,boys
		for (int i = 0; i < s2.length; i++) {//we
			char[] ch = s2[i].toCharArray();//{w,e}
			for (int j = 0; j < ch.length; j++) {//w
				if (ch[0] == 'a' && ch[ch.length - 1] == 'a') {
					System.out.println(s2[i]);
					break;
				}
			}
		}
	}
}
