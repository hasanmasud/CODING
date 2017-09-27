package org.hackerrank.java.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringToken {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		List<String> list = new ArrayList<String>();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			boolean al = Character.isAlphabetic(s.charAt(i));
			if (al) {
				stringBuilder.append(s.charAt(i));
			} else if (stringBuilder.length() > 0) {
				list.add(stringBuilder.toString());
				stringBuilder = new StringBuilder();
			}
		}

		if (stringBuilder.length() > 0) {
			list.add(stringBuilder.toString());
		}
		System.out.println(list.size());
		for (String s1 : list) {
			System.out.println(s1);
		}

		scan.close();
	}

}
