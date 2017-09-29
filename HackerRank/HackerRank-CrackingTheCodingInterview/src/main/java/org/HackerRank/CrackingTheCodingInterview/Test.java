package org.HackerRank.CrackingTheCodingInterview;

public class Test {

	public static void main(String... args) {
		int number = 2510001;
		String strNumber = String.valueOf(number);
		int length = strNumber.length();
		for (int i = 0; i < length; i++) {
			int digit = Integer.valueOf(String.valueOf(strNumber.charAt(i)));
			if (digit > 0) {
				System.out.println(digit * (int) Math.pow(10, length - 1 - i));
			}
		}
	}

}
