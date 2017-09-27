package org.hackerrank.java.string;

import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(A.length() + B.length());
		String s = A.compareTo(B) > 0 ? "Yes" : "No";
		System.out.println(s);
		String A1 = String.valueOf(A.charAt(0)).toUpperCase() + A.substring(1);
		String B1 = String.valueOf(B.charAt(0)).toUpperCase() + B.substring(1);
		System.out.println(A1 + " " + B1);

	}

}
