package org.qsp.SimApp;

public class EachString {
	public static void main(String[] args) {
		String[] s1 = { "sql","web","time" };
		for (int i = 0; i < s1.length; i++) { // saravana
			char[] ch = s1[i].toCharArray(); // {s,a,r,a,v,a,n,a}
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == ch[0] || ch[j] == ch[ch.length-1]) {
					System.out.print(ch[j]);
				}
			}
			System.out.println();
		}
	}
}
