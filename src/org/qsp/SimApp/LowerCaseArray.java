package org.qsp.SimApp;

public class LowerCaseArray {
	public static void main(String[] args) {
		String[] s1 = { "infant","oviyaaa","sam"};

		for (int i = 0; i < s1.length; i++) {//infant
			char[] ch = s1[i].toCharArray();//i,n,f,a,n,t
			for (int j = 0; j < ch.length; j++) {//i
				if (ch[j] == 97 ) {
					
					System.out.println(s1[i]);
					break;
				}
			}
		}
	}
}
