package org.hackerrank.java.string;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();
		System.out.print(S.substring(start, end));
	}
}
