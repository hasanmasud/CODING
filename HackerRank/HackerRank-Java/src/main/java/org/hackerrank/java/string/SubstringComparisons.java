package org.hackerrank.java.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-compare?h_r=next-challenge&h_v=zen
 * 
 * @author masud
 *
 */
public class SubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < s.length() - (k - 1); i++) {
			char arr[] = new char[k];
			int x = 0;
			for (int j = i; j < i + k; j++) {
				arr[x++] = s.charAt(j);
			}
			list.add(new String(arr));
		}

		smallest = Collections.min(list);
		largest = Collections.max(list);
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

}
