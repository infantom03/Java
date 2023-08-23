package org.qsp.SimApp;

public class EndWithA {
	public static void main(String[] args) {
		String[] s1 = { "priya", "kaviya", "nitheya", "tom" };

		for (int i = 0; i < s1.length; i++) {//priya
			char[] ch = s1[i].toCharArray();//p,r,i,y,a
			for (int j = 0; j < ch.length; j++) {
				if (ch[ch.length - 1] == 'a') {
					System.out.println(s1[i]);
					break;
				}
			}
		}
	}
}
