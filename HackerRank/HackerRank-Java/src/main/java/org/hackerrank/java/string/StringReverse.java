package org.hackerrank.java.string;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse?h_r=next-challenge&h_v=zen
 * 
 * @author masud
 *
 */
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		boolean ispalin = true;
		for (int i = 0, len = A.length(); i < len / 2; i++, len--) {
			if (A.charAt(i) != A.charAt(len - 1)) {
				ispalin = false;
				break;
			}
		}
		System.out.println(ispalin ? "Yes" : "No");
	}

}
