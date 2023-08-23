package org.qsp.SimApp;

public class HasDigit {
	public static void main(String[] args) {
		String[] s1 = { "jay03bal02", "tom23onetap", "sam" };

		for (int i = 0; i < s1.length; i++) {// (jay03bal02)
			char[] ch = s1[i].toCharArray();// {j,a,y,0,3,b,a,l,0,2}
			for (int j = 0; j < ch.length; j++) {// {j}
				if (ch[j] >= 47 && ch[j] <= 58) {
					System.out.println(ch[j]);
					System.out.println(s1[i]);
					break;
				}
			}
		}
	}
}